package finalna;

public class Kwadrat extends Prostokat {

    public Kwadrat(double bok) {
        super(bok, bok);
    }

    public double getBok() {
        return a;
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "bok=" + a +
                ", pole=" + obliczPole() +
                ", obwód=" + obliczObwod() +
                '}';
    }
}
