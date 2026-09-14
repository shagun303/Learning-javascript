
import java.util.Scanner;

public class sort_by_frequency_value{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];

        for( int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
            
        
        int[] fre_value = new int[101];

        for(int i = 0; i<n; i++){
            int digit = arr[i];
            fre_value[digit] = fre_value[digit] + 1;
                
        }
           for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (fre_value[arr[i]] < fre_value[arr[j]] ||
                   (fre_value[arr[i]] == fre_value[arr[j]] && arr[i] < arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    
                    
                }
            }
        
        
            
    

