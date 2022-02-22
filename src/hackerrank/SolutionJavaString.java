package hackerrank;

import java.util.Locale;
import java.util.Scanner;

public class SolutionJavaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        System.out.println(first.length()+second.length());
        if (first.compareTo(second)>0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(first.substring(0,1).toUpperCase(Locale.ROOT)+first.substring(1,first.length()) + " " + second.substring(0,1).toUpperCase(Locale.ROOT)+second.substring(1,second.length()));
    }
}
