import java.util.Scanner;
public class most_popular_facebook_post {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        
        for(int i = 0;i<n; i++){
            A[i] = sc.nextInt();
          
        }
        for(int i = 0;i<n; i++){
            B[i] = sc.nextInt();
        }


        int index = 0;

        for(int i = 1; i < A.length; i++){
            if(A[i] > A[index]){
                index = i;
       
            }
            else if(A[i] == A[index]){
                if(B[i] > B[index]){
                    index = i;
                    

                }
            }
        }
        System.out.println(index+1);

    }
    
}
