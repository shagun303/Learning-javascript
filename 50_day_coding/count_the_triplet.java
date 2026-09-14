import java.util.*;

public class count_the_triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
      int n=sc.nextInt();

        int[] arr =new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

          Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if(j>1 && arr[j]==arr[j-1]){
                    continue;
                }

                int a = arr[i];
                int b = arr[j];
                int c = a + b;

                boolean sum_set=false;

                for (int k = 0; k < arr.length; k++) {
                    if (k != i && k != j && c == arr[k] && !sum_set ) {
                        count++;
                        System.out.println(a + " + " + b + " = " + c);
                        break;
                    }

                }

            }

        }
        System.out.println(count);
    }

}
