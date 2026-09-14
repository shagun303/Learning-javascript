import java.util.Scanner;
public class largest_num_kswap {

    public static String swap_k_times(String s,int k){
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length && k>0;i++){
              int maxIdx=i;
              for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[maxIdx]){
                    maxIdx=j;
                }
              }
    

    if (arr[i]<arr[maxIdx]) {
        char temp=arr[i];
        arr[i]=arr[maxIdx];
        arr[maxIdx]=temp;
        k--;
        
    }
    
        }
        return new String(arr);
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        int num=sc.nextInt();
        String str=Integer.toString(num);
          int k=sc.nextInt();
        
    String str1=swap_k_times(str,k);
     System.out.println(str1);

    }
    
}
