package zadanie31;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
    public static void main(String[] args) {
        ArrayList<Kot> koty = new ArrayList<>();
        koty.add(new Kot(4,"mruyczek"));
        koty.add(new Kot(3.5,"filemon"));
        koty.add(new Kot(2,"bonifacy"));
        koty.add(new Kot(6,"w butach"));
        koty.add(new Kot(2,"mial"));

        Collections.sort(koty);

        for (Kot kot : koty) {
            System.out.println(kot);
        }

    }
}
