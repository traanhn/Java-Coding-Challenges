
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How old are you ? ");
        int a = Integer.parseInt(reader.nextLine());
         if (a >= 18){
            System.out.print("You have reached the age of majority!");
         } else {
            System.out.print("You have not reached the age of majority yet");
         }
        // Type your program here 
    }
}
