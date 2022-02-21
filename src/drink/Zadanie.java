package drink;

public class Zadanie {
    public static void main(String[] args) {

        System.out.println(Barman.createDrink("Testowy1","woda",100, "wódka", 50, "sok",200));

        System.out.println(Barman.createDrink(
                        new Drink("Drink2",
                                new Ingredient("woda", 34),
                                new Ingredient("wodka", 50),
                                new Ingredient("sok", 60)
                        )
                )
        );
        System.out.println(Barman.createDrink("Testowy2","woda",130, "wódka", 30, "sok",200));
        System.out.println(Barman.createDrink(
                        "Drink8",
                                new Ingredient("woda", 34),
                                new Ingredient("wodka", 50),
                                new Ingredient("sok", 60)
                        )

        );
    }
}
