
import java.util.*;

public class missing_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       
        int[] arr = new int[n];
        int sum_arr=0;
        for(int i=0;i<n;i++){
            arr[i]=i+1;
            sum_arr=sum_arr+arr[i];           
        }

      System.out.println(sum_arr);

        int[] arr1 = new int[n];
        int sum_arr1=0;
        for (int i = 0; i < n-1; i++) {
            arr1[i] = sc.nextInt();
            sum_arr1=sum_arr1+arr1[i];

        }
            System.out.println(sum_arr1);

       int missing_num=0;
       if(sum_arr1!= sum_arr){
        missing_num=sum_arr - sum_arr1;
       }
    
          System.out.println(missing_num);
       
    }

}
