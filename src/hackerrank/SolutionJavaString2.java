package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SolutionJavaString2 {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> lista = new ArrayList<String>();
        for (int i=0; i<s.length()-k+1; i++) {
            lista.add(s.substring(i,i+k));
        }
        Collections.sort(lista);
        smallest = lista.get(0);
        largest = lista.get(lista.size()-1);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
