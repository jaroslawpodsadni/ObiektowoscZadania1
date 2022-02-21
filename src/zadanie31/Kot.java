package zadanie31;

public class Kot extends ZwierzeDomowe implements Comparable<Kot>{
    //dziedziczenie czyli klasa jest inna klasa
    public Kot(double masa, String nazwa) {
        super(masa, nazwa);
    }

    @Override
    public void dajGlos() {
        System.out.println(nazwa + " : " + "Miauuuu");
    }

    @Override
    public String toString() {
        return "Kot{" +
                "masa=" + masa +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }

    @Override
    public int compareTo(Kot o) {
        //return Double.compare(this.masa,o.masa);
        return nazwa.compareTo(o.nazwa);
    }

 /*   @Override
    public int compareTo(Object o) {
        Kot kot = (Kot)o;
        return Double.compare(this.masa,kot.masa);
    }*/
}
