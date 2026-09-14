import java.util.*;
import java.math.*;

public class word_break_problem {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
      System.out.println("enter the sentrence");

    String sentence=sc.nextLine();

    int sent_length=sentence.length();
  
System.out.println("enter the no of words");

    int word=sc.nextInt();
    sc.nextLine();


  String[] dic_word=new String[word];

 System.out.println("enter the words");
    for(int i=0;i<word;i++){
        dic_word[i] = sc.nextLine();
    }

     System.out.println(sentence);
     System.out.println(word);

    for(String words:dic_word){
        System.out.println(words);
    }
      
      //String[] current_words=new String[dic_word.length];
  
            boolean contain=false;
    for(int i=0;i<dic_word.length;i++){
  
     
        String current_words=dic_word[i];
   
        
        if (sentence.contains(current_words)) {
         contain=true;
         break;

      


  
 }
  } 
  System.out.println(contain); 
 }

}

   



