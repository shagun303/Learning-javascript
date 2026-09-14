import java.util.*;

public class odd_one_out {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] fre_num = new int[101];

        // for counting frequency
        for (int i = 0; i < n; i++) {

            int value = arr[i];
            fre_num[value] = fre_num[value] + 1;

        }

        for (int i = 0; i < fre_num.length; i++) {
            if (fre_num[i] % 2 != 0) {
                System.out.println(i);

            }

        }

    }

}
