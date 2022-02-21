package abstrakcja;

public class Trojkat extends Figura {
    private final double a;
    private final double h;

    public Trojkat(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double obliczPole() {
        return (0.5*a)*h;
    }

    @Override
    public String toString() {
        return "Trojkat{" +
                "a=" + a +
                ", h=" + h +
                ", pole=" + obliczPole() +
                '}';
    }
}
