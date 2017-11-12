import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        int lower = lowerLimit; 
        int upper = upperLimit; 
       int i = 0; 
       
       while( i < howManyTimesHalvable(upperLimit - lowerLimit)) {
            
           if(this.isGreaterThan(this.average(lower, upper))) {
                lower  = this.average(lower, upper) + 1  ; 
                
            } else { 
                upper= this.average(lower, upper)  ; 
                
            } 
            this.average(lower,upper) ; 
            i++; 
            if(lower == upper) {
           break; 
       }}
       
      
       System.out.println("The number you're thinking of is " + this.average(lower, upper));
    }
            
    
    public boolean isGreaterThan(int value){
        System.out.println("Is your number greater than " + value +" ? (y/n)");
        String ans = this.reader.nextLine();
        if(ans.equals("y")){
            return true;
        } return false;
    }
    
    public int average(int firstNumber, int secondNumber){
        return (firstNumber + secondNumber)/2;
    }
    // implement here the methods isGreaterThan and average

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
    
    
       
}
