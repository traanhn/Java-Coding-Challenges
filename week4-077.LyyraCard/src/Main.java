
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code 
   
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        // write code here
        
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        
        cardPekka.loadMoney(20.00);
        cardBrian.payGourmet();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        
        cardBrian.loadMoney(50.00);
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
               
        
        
    }
}
