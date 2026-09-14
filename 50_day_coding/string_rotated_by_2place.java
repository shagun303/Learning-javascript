import java.util.Scanner;

public class string_rotated_by_2place {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String s1_lower = s1.toLowerCase();
        String s2_lower = s2.toLowerCase();

        if (s1_lower.length() != s2_lower.length()) {
            System.out.println("false");
            return;
        }

        if (s1_lower.length() < 2) {
            System.out.println("false");
            return;
        }

        String rotated_anticlockwise_s1 = s1_lower.substring(2) + s1_lower.substring(0, 2);
        String rotated_clockwise_s1 = s1_lower.substring(s1_lower.length() - 2)
                + s1_lower.substring(0, s1_lower.length() - 2);


      

        if (s2_lower.equals(rotated_clockwise_s1) || s2_lower.equals(rotated_anticlockwise_s1)
             ) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}

