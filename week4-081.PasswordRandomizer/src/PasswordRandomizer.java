import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random; 
    private int length  ; 

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random(); 
        
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        int i = 0;
        while ( i < this.length){
        i++; 
        password += "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26)); 
                }
        return password;
    }
}
