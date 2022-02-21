package wlasne1;

public abstract class Device {
    protected String name;
    protected Place place;
    protected double price;

    public Device(String name, Place place, double price) {
        this.name = name;
        this.place = place;
        this.price = price;
    }

    @Override
    public String toString() {
    return "";
    }
}
