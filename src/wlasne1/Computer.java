package wlasne1;

public class Computer extends Device implements TurnOnOffAble, Connectable {

    public Computer(String name, Place place, double price) {
        super(name, place, price);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void turnOnOff(String type) {
        switch (type) {
            case "On" :
                System.out.println("Komputer : " + super.name + " został włączony");
                break;
            case "Off" :
                System.out.println("Komputer : " + super.name + " został wyłączony");
                break;
        }
    }


    public void connect(boolean connected) {
        if (connected) {
            System.out.println("Komputer : " + super.name + " został podłączony");
        } else if (!(connected)) {
            System.out.println("Komputer : " + super.name + " został odłączony");
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", place=" + place +
                ", price=" + price +
                '}';
    }
}
