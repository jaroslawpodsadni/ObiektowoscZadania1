package songs;

public class Song {
    private String title;
    private int length;
    private Author author;
    private static int number = 0;

    public Song(String title, int length, Author author) {
        this.title = title;
        this.length = length;
        this.author = author;
        number += 1;
    }


    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public String getAuthor() {
        return this.author.getFirstName() + " " + this.author.getLastName();
    }

    public int getNumber() {
        return this.number;
    }

}
