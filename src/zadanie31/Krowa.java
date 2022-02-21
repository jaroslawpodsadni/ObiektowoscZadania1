package zadanie31;

public class Krowa extends ZwierzeHodowlane implements Mlekodajnosc {
    private static int id = 0;

    public Krowa(double masa) {
        super(masa);
        this.id += 1;
    }

    @Override
    public void dajGlos() {
        System.out.println("Krowa : Muuuuuuu");
    }

    @Override
    public double dajMleko() {
       // System.out.println("Krowa id "+this.id+" : " + ((1/100) * masa)); //nie działa
        System.out.println("Krowa id "+this.id+" : " + ((1.0/100) * masa));
        return ((1.0/100) * masa);
    }

    @Override
    public String toString() {
        return "Krowa{" +
                "masa=" + masa +
                '}';
    }
}
