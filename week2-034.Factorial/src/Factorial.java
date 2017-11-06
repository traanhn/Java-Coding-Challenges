import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        
        int pro = 1; 
        int i = 1;
        while (i <= a) {
            pro = pro * i;
            i++; 
        }
        System.out.println("Factorial is " + pro);
        
    }
}
