import java.util.Arrays;

public class rearrange_array {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = { 1, 2, 6, 4, 5, 3 };
        int[] arr1 = new int[n];

        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i]);
        // }

    

        for (int i = 0; i < n; i++) {
            arr1[i] = arr[n - 1 - i];
          //  System.out.print(arr1[i]);
        }

    
        int index1=0;
        int index2=0;

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
           
                System.out.print(arr[index1]);
                index1++;
            }
                
             else {
 System.out.print(arr1[index2]);
 index2++;

                
                
            }
        }

    }

}
