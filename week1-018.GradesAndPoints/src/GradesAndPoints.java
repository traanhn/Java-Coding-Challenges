
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the point [0-60] :");
        int point = Integer.parseInt(reader.nextLine());
        
        
        if(point >0 && point < 30) {
            System.out.println("Grade:failed ");
        } else if (point < 35) {
            System.out.println("Grade : 1");
        } else if (point < 40) {
            System.out.println("Grade : 2");
        } else if (point < 45) {
            System.out.println("Grade : 3");
        } else if (point < 50) {
            System.out.println("Grade : 4");
        } else if (point < 61) {
            System.out.println("Grade : 5");
        }
    }
}
