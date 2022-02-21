package drink;

public class Drink {
    private String name;
    private Ingredient ingredient1;
    private Ingredient ingredient2;
    private Ingredient ingredient3;
    private static int increment = 0;

    public Drink(String name, Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3) {
        this.increment += 1;
        this.name = name;
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
    }

    @Override
    public String toString() {
        int sum = ingredient1.getAmount() + ingredient2.getAmount() + ingredient3.getAmount();
        return  this.increment + ". Drink: " + name + "\n" +
                "Lista składników:\n" +
                ingredient1.getName()+" - ilość: "+ingredient1.getAmount()+" - procent: " + ((ingredient1.getAmount()*100)/sum) + "%" + "\n" +
                ingredient2.getName()+" - ilość: "+ingredient2.getAmount()+" - procent: " + ((ingredient2.getAmount()*100)/sum)  + "%" + "\n" +
                ingredient3.getName()+" - ilość: "+ingredient3.getAmount()+" - procent: " + ((ingredient3.getAmount()*100)/sum)  + "%" + "\n"
                ;
    }
}
