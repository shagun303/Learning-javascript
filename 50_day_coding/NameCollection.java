
import java.util.Scanner;

public class NameCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of names to store");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        System.out.println("enter the names");
        for (int i = 0; i < n; i++) {

            names[i] = sc.nextLine();

        }

        String longest_name = names[0];
        for (int i = 0; i < n; i++) {
            if (names[i].length() > longest_name.length())

                longest_name = names[i];
        }

        System.out.println("output of the code is");

        for (String name : names) {
            if (name.length() == longest_name.length()) {
                System.out.println(name);
            }

        }

    }
}