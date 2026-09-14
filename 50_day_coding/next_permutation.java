import java.util.Scanner;
public class next_permutation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        if (n <= 1) {
  
    return;
}


        for(int i = 0;i < n;i++){
            nums[i] = sc.nextInt();
        }

        int index = -1;

        for(int i = n - 2 ;i >= 0; i--){
            if(nums[i] < nums[i+1]){
               index = i;
               break;
               
            }
    
        }

      if(index != -1){
            for(int j = n - 1;j > index; j--){
                if(nums[j] > nums[index]){
                    int temp = nums[index];
                    nums[index] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
      }
if (index == -1) {
   
    for (int a = 0, b = n - 1; a < b; a++, b--) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
} else {
  
    for (int a = index + 1, b = n - 1; a < b; a++, b--) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

        

      for(int i = 0;i < n;i++){
        System.out.print(nums[i]+" ");
      } 

    }
    
}
