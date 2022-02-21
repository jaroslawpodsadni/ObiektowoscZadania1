package wlasne1;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) throws ClassCastException {
        ArrayList<Device> urzadzenia = new ArrayList<>();
        urzadzenia.add(new Computer("Dell", Place.MAGAZYN,  4500));
        urzadzenia.add(new Keyboard("Logic", Place.WYSTAWA, 245));
        urzadzenia.add(new Printer("HP", Place.ZAPLECZE, 599, 3));
        urzadzenia.add(new Drive("DYSK 1000GB", Place.ZAPLECZE, 449, "Samsung", DriveType.SSD, 1000));
        urzadzenia.add(new Computer("IBM" , Place.WYSTAWA, 7999));
        urzadzenia.add(new Drive("DYSK 512GB", Place.WYSTAWA, 250, "Caviar", DriveType.HDD, 512));

        //Collections.sort(urzadzenia, new PriceComparator()); nadpisanie metody sort w Collection zeby sortowac Device
        urzadzenia.sort((dev1, dev2) -> Double.compare(dev1.price, dev2.price)); //sortowanie po cenie
        //urzadzenia.sort((dev1, dev2) -> dev1.name.compareTo(dev2.name)); //sortowanie po nazwie
        //urzadzenia.removeIf(dev1 -> dev1.price <= 500); //usuniecie jesli cena ponizej 500

        for (Device urzadzenie: urzadzenia) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println(urzadzenie.toString());
            try {
                Connectable urz2 = (Connectable) urzadzenie;
                urz2.connect(true);
            } catch (ClassCastException e) {
                System.out.println("Urządzenie " + urzadzenie.name + " nie może zostać podłączone");
            }
            try {
                TurnOnOffAble urz = (TurnOnOffAble) urzadzenie;
                urz.turnOnOff("On");
            } catch (ClassCastException e) {
                System.out.println("Urządzenie " + urzadzenie.name + " nie może zostać włączony/a ponieważ nie posiada przycisku ON/OFF");
            }
            try {
                TurnOnOffAble urz = (TurnOnOffAble) urzadzenie;
                urz.turnOnOff("Off");
            } catch (ClassCastException e) {
                System.out.println("Urządzenie " + urzadzenie.name + " nie może zostać włączony/a ponieważ nie posiada przycisku ON/OFF");
            }
            try {
                Connectable urz2 = (Connectable) urzadzenie;
                urz2.connect(false);
            } catch (ClassCastException e) {
                System.out.println("Urządzenie " + urzadzenie.name + " nie może zostać podłączone");
            }
        }

        /*TurnOnOff urzadzenie1 = (TurnOnOff) urzadzenia.get(0);
        urzadzenie1.turnOnOff("On");
        Connectable urzadzenie2 = (Connectable) urzadzenie1;
        urzadzenie2.connect(true);*/





    }
}
