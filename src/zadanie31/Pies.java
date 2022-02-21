package zadanie31;


public class Pies extends ZwierzeDomowe implements Dajalapy{

    public Pies(double masa, String nazwa) {
        super(masa, nazwa);
    }

    @Override
    public void dajGlos() {
        System.out.println(nazwa + " : " + "Hał hał");
    }

    @Override
    public void podajLape() {
        System.out.println(nazwa + " : " + "Podaje łapę");
    }

    @Override
    public String toString() {
        return "Pies{" +
                "masa=" + masa +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
