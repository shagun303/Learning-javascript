import java.util.Scanner;

public class world_chess_championship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();

        String str = sc.nextLine();
      

        int carlsenPoints = 0;
        int chefPoints = 0;
         
        for(char ch:str.toCharArray()){
            if(ch == 'C'){
               carlsenPoints += 2; 
            }
            else if(ch == 'N'){
                chefPoints += 2;
            }
            else if(ch == 'D'){
                carlsenPoints += 1;
                chefPoints += 1;
            }
        }

        int prize ;
        if(carlsenPoints > chefPoints){
            prize = x * 60;
        }
        else if(carlsenPoints < chefPoints){
            prize = x * 40;
        }
        else{
            prize = x * 55;
        }
 
        System.out.println(prize);

    }
    
}
