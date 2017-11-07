
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();  
        while( true) {
        System.out.print("Type a word: ");
        String a = reader.nextLine();
        words.add(a);
        if (a.isEmpty()){
            break;
        }
        }
        Collections.sort(words);
        for (String i : words) {
            System.out.println(i);
        }
        
    }
}
