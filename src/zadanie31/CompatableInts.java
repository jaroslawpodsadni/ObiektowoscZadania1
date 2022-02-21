package zadanie31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CompatableInts {
    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<>();
        liczby.add(7);
        liczby.add(1);
        liczby.add(45);
        liczby.add(25);
        liczby.add(-45);
        liczby.add(8);
        liczby.add(0);

        Collections.sort(liczby);

        System.out.println(liczby);
    }
}
