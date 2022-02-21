package zadanie31;

public class Kaczka extends ZwierzeHodowlane implements Jajonosnosc{
    public Kaczka(double masa) {
        super(masa);
    }

    @Override
    public void dajGlos() {
        System.out.println("Kaczka : kwa kwa kwa");
    }

    @Override
    public void zniesJajo() {
        System.out.println("Kaczka : znoszę jajko");
    }

    @Override
    public String toString() {
        return "Kaczka{" +
                "masa=" + masa +
                '}';
    }
}
