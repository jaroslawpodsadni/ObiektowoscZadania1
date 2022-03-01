package drink;

import java.util.ArrayList;

public class Drink {
    private String name;
    //todo zamienic na listę (...)
    private ArrayList<Ingredient> lista_ingredient = new ArrayList<>();
/*    private Ingredient ingredient1;
    private Ingredient ingredient2;
    private Ingredient ingredient3;*/
    private static int increment = 0;

   /* public Drink(String name, Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3) {
        this.increment += 1;
        this.name = name;
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
    }*/

    public Drink(String name, Ingredient... ingredient) {
        this.increment += 1;
        this.name = name;
        for (int i = 0; i<ingredient.length; i++) {
            this.lista_ingredient.add(ingredient[i]);
        }
    }

    @Override
    public String toString() {
       /* int sum = ingredient1.getAmount() + ingredient2.getAmount() + ingredient3.getAmount();
        return  this.increment + ". Drink: " + name + "\n" +
                "Lista składników:\n" +
                ingredient1.getName()+" - ilość: "+ingredient1.getAmount()+" - procent: " + ((ingredient1.getAmount()*100)/sum) + "%" + "\n" +
                ingredient2.getName()+" - ilość: "+ingredient2.getAmount()+" - procent: " + ((ingredient2.getAmount()*100)/sum)  + "%" + "\n" +
                ingredient3.getName()+" - ilość: "+ingredient3.getAmount()+" - procent: " + ((ingredient3.getAmount()*100)/sum)  + "%" + "\n"
                ;*/
        int sum = 0;
        for (int i = 0; i<lista_ingredient.size(); i++) {
            sum += lista_ingredient.get(i).getAmount();
        }
        String out = "";
        out = this.increment + ". Drink: " + name + "\n" +
                "Lista składników:\n";
        for (int i = 0; i<lista_ingredient.size(); i++) {
            out = out +  lista_ingredient.get(i).getName()+" - ilość: "+lista_ingredient.get(i).getAmount()+" - procent: " + ((lista_ingredient.get(i).getAmount()*100)/sum) + "%" + "\n";
        }
        return out;
    }
}
