package wlasne1;

public class Printer extends Device implements TurnOnOffAble, Connectable {
    private int toner;

    public Printer(String name, Place place, double price, int toner) {
        super(name, place, price);
        this.toner = toner;
    }

    public void turnOnOff(String type) {
        switch (type) {
            case "On" :
                System.out.println("Drukarka : " + super.name + " została włączona");
                break;
            case "Off" :
                System.out.println("Drukarka : " + super.name + " została wyłączona");
                break;
        }
    }


    public void connect(boolean connected) {
        if (connected) {
            System.out.println("Drukarka : " + super.name + " została podłączona");
        } else if (!(connected)) {
            System.out.println("Drukarka : " + super.name + " została odłączona");
        }
    }

    @Override
    public String toString() {
        return "Printer{" +
                "name='" + name + '\'' +
                ", place=" + place +
                ", price=" + price +
                ", toner=" + toner +
                '}';
    }
}
