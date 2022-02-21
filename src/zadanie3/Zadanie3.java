package zadanie3;

public class Zadanie3 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.loadData();
        matrix.showData();
        System.out.println("");
        System.out.println("Suma liczb na przekątnej równa się " + matrix.calculateSum());
    }
}
