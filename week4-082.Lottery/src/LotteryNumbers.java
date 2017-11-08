import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
   

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        
        Random random = new Random(); 
        // Write the number drawing here using the method containsNumber()
        int n = 0;  
        while(n < 7){
            int i = random.nextInt(39) + 1;
            if(this.containsNumber(i) == false){
                this.numbers.add(i);
                n++; 
        }
    }
    } 

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
       
        if(this.numbers.contains(number)){
             
            return true; }
        
       
        
        return false;
    }
}

