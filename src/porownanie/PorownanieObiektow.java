package porownanie;

public class PorownanieObiektow {
    public static void main(String[] args) {
        Prostokat prostokat1 = new Prostokat(2,3);
        Prostokat prostokat2 = new Prostokat(2,3);
        Prostokat prostokat3 = prostokat1;

        Kwadrat kwadrat1 = new Kwadrat(6);
        Kwadrat kwadrat2 = new Kwadrat(6);

        Trojkat trojkat1 = new Trojkat();

        System.out.println(prostokat1 == prostokat2);
        System.out.println(prostokat1 == prostokat3);
        System.out.println(prostokat1.equals(prostokat2));
        System.out.println(prostokat1.equals(trojkat1));
        System.out.println(kwadrat1.equals(kwadrat2));
        System.out.println(kwadrat1.hashCode()==kwadrat2.hashCode());
    }
}
