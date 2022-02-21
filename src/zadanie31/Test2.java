package zadanie31;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {

        ArrayList<Zwierze> zwierzeta = new ArrayList();
        zwierzeta.add(new Kot(8, "Mruczek"));
        zwierzeta.add(new Pies(23, "Reksio"));
        zwierzeta.add(new Kura(4));
        zwierzeta.add(new Krowa(300));

        for (int i = 0; i<zwierzeta.size(); i++) {
            zwierzeta.get(i).dajGlos();
        }

       /* for (Zwierze zwierze : zwierzeta) {
            zwierze.dajGlos();
            zwierze.podajLape();
            zwierze.zniesJajo();
            zwierze.dajMleko();
        }*/
    }
}
