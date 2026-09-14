import java.util.Arrays;
import java.util.Scanner;

public class longest_consecutive_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int count = 1;
        int maxCount = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < n -1; i++) {

            if (arr[i] == arr[i + 1])
                continue;
            if (arr[i] + 1 == arr[i + 1]) {
                count++;
            }

            else {
                count = 1;

            }
            maxCount = Math.max(maxCount, count);
        }
        System.out.println( maxCount);
      
    }

}
