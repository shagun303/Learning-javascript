import java.util.Scanner;
public class DNA_storage {

    public static void DNA(String s,String[] DNA,int n ){
        if(n%2==0){

    
       
        for(int i=0;i<n;i+=2){
            String pair=s.substring(i,i+2);
            switch(pair){
                case "00":
                    System.out.print(DNA[0]+" ");
                      break;
                case "01":
                    System.out.print(DNA[1]+" ");     
                    break;
                case "10":
                    System.out.print(DNA[2]+" ");
                    break;
                case "11":
                    System.out.print(DNA[3]+" ");    
                    break;
                default:
                    System.out.println("invalid pair");         
            }
           
        }
       }
       else{
        return;
       }
}
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
      
        String str=sc.nextLine();
     
        String[] DNA={"A","T","C","G"};

        DNA(str,DNA,n);
        
    }
    
}
