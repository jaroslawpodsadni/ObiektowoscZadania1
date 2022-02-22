package zadanie4;


public class Test {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        System.out.println(firstClass.dodaj(4,5));
        System.out.println(firstClass.dodaj(4.0, 5.0));
        System.out.println(firstClass.dodaj(4.2F, 5.32323));
        System.out.println(firstClass.dodaj(52345234523456246L, 345235246246246243L));
        System.out.println(firstClass.dodaj(1,2,3));
        System.out.println(firstClass.dodaj(1,2,3,4,5,6,7,8,9));

    }



}
