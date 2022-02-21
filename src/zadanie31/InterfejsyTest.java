package zadanie31;

import java.util.ArrayList;

public class InterfejsyTest {
    public static void main(String[] args) {

        ArrayList<Jajonosnosc> ptaki = new ArrayList<>();


        ptaki.add(new Kura(3));
        ptaki.add(new Kaczka(10));

        for (Jajonosnosc ptak : ptaki) {
            ptak.zniesJajo();
        }

        Krowa krowa = new Krowa(300);
        Pies pies = new Pies(15, "Azor");

        pies.podajLape();
        krowa.dajMleko();

        Koza koza = new Koza(50);
        Koza koza2 = new Koza(60);

        System.out.println(koza.dajMleko());
        System.out.println(koza2.dajMleko());



    }
}
