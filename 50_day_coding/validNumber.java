import java.util.Scanner;
public class validNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        int ePos = Math.max(num.indexOf('e'), num.indexOf('E'));

        if (ePos == -1 || ePos == 0 || ePos == num.length() - 1) {
            System.out.println(false); 
            return;
        }

        String base = num.substring(0, ePos);
        String exp = num.substring(ePos + 1);

        if (!isValidBase(base) || !isValidExponent(exp)) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    static boolean isValidBase(String s) {
        int dotCount = 0, digitCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '.') dotCount++;
            else if (Character.isDigit(c)) digitCount++;
            else if (c != '+' && c != '-') return false;
        }
        return dotCount <= 1 && digitCount > 0;
    }

    static boolean isValidExponent(String s) {
        int digitCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) digitCount++;
            else if (i == 0 && (c == '+' || c == '-')) continue;
            else return false;
        }
        return digitCount > 0;
    }
}

