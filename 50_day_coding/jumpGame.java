import java.util.Scanner;

public class jumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0;i < n;i++){
            num[i] = sc.nextInt();
        }

        int jump = 0;
        int index = 0;

        while (index < n) {
            int currentValue = num[index];
            if (index + currentValue >= num.length - 1) {
                jump++;
                break;
            }

            int maxReach = index;
            for (int i = index + 1; i <= index + currentValue && i < num.length; i++) {
                if (i + num[i] > maxReach + num[maxReach]) {
                    maxReach = i;
                }
            }

            index = maxReach;
            jump++;
        }
        System.out.print(jump);

    }

}
