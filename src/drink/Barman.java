package drink;

public class Barman {

    public static Drink createDrink(Drink drink) {
       return drink;
    }

    public static Drink createDrink(String name, String ingName1, int ingAmount1, String ingName2, int ingAmount2, String ingName3, int ingAmount3) {
        Drink drink = new Drink(name, new Ingredient(ingName1,ingAmount1), new Ingredient(ingName2,ingAmount2),new Ingredient(ingName3,ingAmount3));
        return drink;
    }

    public static Drink createDrink(String name, Ingredient... ingredient) {
        Drink drink = new Drink(name, ingredient);
        return drink;
    }

}
