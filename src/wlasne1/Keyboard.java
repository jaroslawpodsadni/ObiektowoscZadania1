package wlasne1;

public class Keyboard extends Device implements Connectable{

    public Keyboard(String name, Place place, double price) {
        super(name, place, price);
    }

    public void connect(boolean connected) {
        if (connected) {
            System.out.println("Klawiatura : " + super.name + " została podłączona");
        } else if (!(connected)) {
            System.out.println("Klawiatura : " + super.name + " została odłączona");
        }
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "name='" + name + '\'' +
                ", place=" + place +
                ", price=" + price +
                '}';
    }
}
