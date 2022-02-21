package zadanie31;

public class Koza extends ZwierzeHodowlane implements Mlekodajnosc {
    private static int id2 = 0;

    public Koza(double masa) {
        super(masa);
        this.id2 += 1;
    }

    @Override
    public void dajGlos() {
        System.out.println("Koza : Meee");
    }

    @Override
    public double dajMleko() {
       // System.out.println("Krowa id "+this.id+" : " + ((1/100) * masa)); //nie działa
        System.out.println("Koza id "+this.id2+" : " + ((1.0/100) * masa));
        return ((1.0/100) * masa);
    }

    @Override
    public String toString() {
        return "Krowa{" +
                "masa=" + masa +
                '}';
    }
}
