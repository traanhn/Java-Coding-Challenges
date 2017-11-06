
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        
        System.out.print("Up to what number ? ");
        int a = Integer.parseInt(reader.nextLine());
        int b = 0; 
        while ( b< a){
            b=b+ 1;
            System.out.println(b);
        }
    }
}
