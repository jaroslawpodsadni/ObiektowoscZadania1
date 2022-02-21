package zadanie31;

public class Test3 {
    public static void main(String[] args) {
        Farma farma = new Farma();
        farma.setPies(new Pies(15, "latek"));
        farma.setKot(new Kot(3, "mruczek"));
        farma.dodajZwierze(new Kura(2));
        farma.dodajZwierze(new Kura(2));
        farma.dodajZwierze(new Kura(2));
        farma.dodajZwierze(new Krowa(303));
        farma.dodajZwierze(new Krowa(303));
        farma.dodajZwierze(new Krowa(303));
        farma.dodajZwierze(new Krowa(303));


        System.out.println("Kury : ");
        Farma.wypiszZwierzeta(farma.getKury());
        System.out.println("Krowy : ");
        Farma.wypiszZwierzeta(farma.getKrowy());

        System.out.println(farma.getIlosczKur());
        System.out.println(farma.getIlosczKrow());
    }
}
