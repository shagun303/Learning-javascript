import java.util.Scanner;
public class kokoEatingBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int [] arr = new int[n];
        int divNo = 8;
        int sum = 0;
      

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n - 1 ; j++){
            
             int result = (int) Math.ceil((double) arr[i] / arr[j]); 
            
              sum += result;
            
        }

    }
      
   System.out.print(sum); 
}
}

