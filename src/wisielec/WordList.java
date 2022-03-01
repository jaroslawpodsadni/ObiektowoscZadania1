package wisielec;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordList {
    private ArrayList<String> words = new ArrayList<String>();

    public WordList(String Filename) throws FileNotFoundException  {
        Scanner scanner = new Scanner(new File(Filename));
        while(scanner.hasNext()) {
            this.words.add(scanner.nextLine());
        }
        scanner.close();
    }

    public String getRandomWord(ArrayList<String> words) {
        Random random = new Random();
        return words.get(random.nextInt(words.size() - 1));
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public static String replaceCharAt(String text, int pos, String c) {
        return text.substring(0, pos) + c
                + text.substring(pos + 1);
    }

    public String discoverWord(String word, String hidden, String c) {
        Game game = new Game();
        while (word.contains(c)) {
            hidden = WordList.replaceCharAt(hidden, word.indexOf(c), c);
            word = WordList.replaceCharAt(word, word.indexOf(c), "*");
        }
        return hidden;
    }

    public String hideWord(String word, String c, Settings settings) {
        while (word.contains(c)) {
            //hidden = WordList.replaceCharAt(hidden, word.indexOf(c), c);
            word = WordList.replaceCharAt(word, word.indexOf(c), settings.getC());
        }
        return word;
    }

    public void checkWord(String word, String hidden, String look, Settings settings) {
        Game game = new Game();
        if (word.contains(look)) {
            game.setHidden(discoverWord(word, hidden, look));
            game.setWord(hideWord(word,look,settings));
        } else {
            settings.setTryCount(settings.getTryCount()+1);
            System.out.println("Błąd nr " + settings.getTryCount());
        }
    }


}
