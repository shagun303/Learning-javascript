public class ProductArrayExceptSelf{

    public static void product_array(int n,int[] arr,int[] result,int index){
          
         
          if(index == n){
            return;
          }
 
          int product = 1;
        for(int i = 0; i < n ; i++ ){
          
            if(i == index){
                continue;
               
            }
             product = product * arr[i];
        }
        result[index] = product;
       product_array(n,arr,result,index+1);
     
        
    }

      public static void main(String[] args) {
        int n = 6;
        int index = 0;
        int[] arr = {-1,2,-3,4,-5,6};
      int [] result = new int[n];
         product_array(n,arr,result,index);
         
         for(int rel:result){
            System.out.print(rel+" ");
         }
    }
  

    }

