package wlasne1;

public class Drive extends Device implements Connectable{
    private String producer;
    private DriveType driveType;
    private double size;

    public Drive(String name, Place place, double price, String producer, DriveType driveType, double size) {
        super(name, place, price);
        this.producer = producer;
        this.driveType = driveType;
        this.size = size;
    }

    public void connect(boolean connected) {
        if (connected) {
            System.out.println("Dysk : " + super.name + " " +driveType + " " + " został podłączony");
        } else if (!(connected)) {
            System.out.println("Dysk : " + super.name + " " +driveType + " " + " został odłączony");
        }
    }

    @Override
    public String toString() {
        return "Drive{" +
                "name='" + name + '\'' +
                ", place=" + place +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                ", driveType=" + driveType +
                ", size=" + size +
                '}';
    }
}
