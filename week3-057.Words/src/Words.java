import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String a = ""; 
        
        while( true) {
        System.out.print("Type a word: ");
        a = reader.nextLine();
        words.add(a);
        if (a.isEmpty()){
            break;
        }
        }
        
        
        System.out.println("You typed the following words:");
        for (String i : words) {
            System.out.println(i);
        }
        
        
    }
    
}




