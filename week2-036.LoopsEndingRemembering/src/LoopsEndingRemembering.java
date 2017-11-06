import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        int sum = 1;
        int i = -1;
        int odd = 0;
        int even = 0;
        while(true){
        int a = Integer.parseInt(reader.nextLine());
        sum = sum + a ; 
        i++;
        if( a%2 == 1 && a > 0){
            odd++;
        }else {
            even++;
        }
        
        
        
        if(a == -1){
           System.out.println("Thank you and see you later!");
           System.out.println("The sum is " +  sum  ); 
           System.out.println("How many numbers: " + i);
           System.out.println("Average " + (double)sum/i);
           System.out.println("Even number " + (even-1));
           System.out.println("Odd numbers " + odd);
           break; 
        } 
        
        
        }
        
    }
}
