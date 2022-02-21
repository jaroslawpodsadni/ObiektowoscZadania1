package konsultacje02;

public class Test2 {
    public static void main(String[] args) {
        Integer game1 = 2005;
        Integer game2 = 2010;

        System.out.println(game1);
        System.out.println(game2);

        game1 = game2;

        System.out.println(game1);
        System.out.println(game2);

        game1 = 7;
        System.out.println(game1);
        System.out.println(game2);
    }
}
