import java.util.Scanner;

public class minimumWindowSubstring {

    // Checks if substring contains all characters from t (with correct frequency)
    public static boolean containsAll(String sub, String t) {
        int[] subCount = new int[128];
        int[] tCount = new int[128];

        for (char c : sub.toCharArray()) {
            subCount[c]++;
        }

        for (char c : t.toCharArray()) {
            tCount[c]++;
        }

        for (int i = 0; i < 128; i++) {
            if (tCount[i] > subCount[i]) return false;
        }

        return true;
    }

    public static String minString(String s, String t) {
        int n = s.length();
        int m = t.length();
        int minLen = Integer.MAX_VALUE;
        String result = "";

        for (int i = 0; i < n; i++) {
            for (int j = i + m; j <= n; j++) { 
                String sub = s.substring(i, j);
                if (containsAll(sub, t) && sub.length() < minLen) {
                    minLen = sub.length();
                    result = sub;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(minString(s, t));
    }
}

