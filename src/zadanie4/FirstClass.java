package zadanie4;

public class FirstClass {

    public double dodaj(double a, double b) {
        System.out.println("Double");
        return a+b;
    }

    /*public int dodaj(int a, int b) {
        System.out.println("Integer");
        return a+b;
    }

    public int dodaj(int a, int b, int c) {
        System.out.println("Integer");
        return a+b+c;
    }*/

    public int dodaj(int... tab) {
        System.out.println("Integer");
        int suma = 0;
        for (int i=0; i<tab.length; i++) {
            suma += tab[i];
        }
        return suma;
    }

    public long dodaj(long a, long b) {
        System.out.println("Long");
        return a+b;
    }

    public float dodaj(float a, float b) {
        System.out.println("Float");
        return a+b;
    }

}
