package zadanie31;

public class Kura extends ZwierzeHodowlane implements Jajonosnosc{
    public Kura(double masa) {
        super(masa);
    }

    @Override
    public void dajGlos() {
        System.out.println("Kura : ko ko ko");
    }

    @Override
    public void zniesJajo() {
        System.out.println("Kura : znoszę jajko");
    }

    @Override
    public String toString() {
        return "Kura{" +
                "masa=" + masa +
                '}';
    }
}
