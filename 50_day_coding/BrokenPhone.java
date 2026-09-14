import java.util.Scanner;
public class BrokenPhone {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Xrupee = sc.nextInt();
        int Yrupee = sc.nextInt();

        if(Xrupee < Yrupee){
            System.out.println("REPAIR");
        }
       else if(Xrupee > Yrupee){
        System.out.println("NEW PHONE");

       }
       else{
        System.out.println("ANY");
       }

    }
}
