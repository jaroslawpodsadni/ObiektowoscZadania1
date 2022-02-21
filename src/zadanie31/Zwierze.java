package zadanie31;

public abstract class Zwierze {
    final protected double masa;

    public Zwierze(double masa) {
        this.masa = masa;
    }

    public void dajGlos() {
        System.out.println("Daje Głos");
    }

    public void podajLape(){}



    public double getMasa() {
        return masa;
    }

}
