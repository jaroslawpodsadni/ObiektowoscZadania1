package konsultacje02;

public class Test {
    public static void main(String[] args) {
        Game game1 = new Game(5);
        Game game2 = new Game(10);

        System.out.println(game1.getLevel());
        System.out.println(game2.getLevel());

        game1 = game2;

        System.out.println(game1.getLevel());
        System.out.println(game2.getLevel());

        game1.setLevel(7);
        System.out.println(game1.getLevel());
        System.out.println(game2.getLevel());

    }
}
