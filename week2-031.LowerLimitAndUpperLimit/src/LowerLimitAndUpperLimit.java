
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
        int b = Integer.parseInt(reader.nextLine());
        int i = a; 
        while (i<=b){
            System.out.println(i);
            i++; 
        }
        // write your code here

    }
}
