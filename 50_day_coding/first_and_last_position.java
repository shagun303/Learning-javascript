import java.util.Scanner;

public class first_and_last_position {

    public static int firstPosition(int n, int[] arr, int num, int start) {

        for (int i = 0; i < n; i++) {

            if (arr[i] == num) {
                start += i + 1;
                break;
            }
        }
        return start;
    }

    public static int lastPosition(int n, int[] arr, int num, int end) {

        for (int i = 0; i < n; i++) {

            if (arr[n - 1 - i] == num) {
                end += n - 1 - i + 1;
                break;

            }

        }
        return end;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();

        int start = -1;
        int end = -1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        System.out.print(firstPosition(n, arr, num, start) + " ");
        System.out.println(lastPosition(n, arr, num, end));

    }

}
