
import java.util.*;

public class fascinating_num{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
          int original_num=sc.nextInt();

          if(original_num<100){
            return;
          }

  String concate_number=String.valueOf(original_num)+String.valueOf(original_num*2)+String.valueOf(original_num*3);
    
       boolean[] digits=new boolean[10];

            for(int i=0;i<concate_number.length();i++){
 
          int result =concate_number.charAt(i)-'0';
           if(result==0 || digits[result] ){
            System.out.println("No");
            return;
           }
           digits[result]=true;
        }

    System.out.println("Yes");
    
    
    
    
    
    
    
    }}