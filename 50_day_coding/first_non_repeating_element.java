import java.util.Scanner;

public class first_non_repeating_element {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        int[] arr=new int[num];

        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }

     
        int n=arr.length;

    
     
        for(int i=0;i<n;i++){
             int count=0;
            for(int j=0;j<n;j++){
                if( i!=j && arr[i]==arr[j]){
                  count++;
                
                }
                }
                if(count==0){
                    if(i==0){
                          System.out.println(-1); 
                } else {
                    System.out.println(arr[i]);
                    break;
                }

                    }
            
              
    }
   

        }
    }

    

