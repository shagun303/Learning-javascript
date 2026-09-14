import java.util.*;

public class next_greater_elment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            boolean get_num = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    arr1[i] = arr[j];
                    get_num = true;
                    break;
                }
            }

            if (!get_num) {
                arr1[i] = -1;
            }

        }
        for (int result : arr1) {
            System.out.print(result + " ");
        }

    }
}
