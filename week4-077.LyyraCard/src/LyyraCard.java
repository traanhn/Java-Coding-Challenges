/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 */
public class LyyraCard {
    private  double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart; 
        
    }

    @Override
    public String toString() {
        
        return "The card has " + this.balance +" euros"; 
        // write code here
    }
    
    public void payEconomical() {
    // write code here
        if(this.balance >= 2.50){
            this.balance = this.balance - 2.50; 
        }
    }

public void payGourmet() {
    // write code here
    if(this.balance >= 4.00){
    this.balance = this.balance - 4.00; 
    }
}

public void loadMoney(double amount) {
    // write code here
    
if(amount > 0){
    if(150.00 - this.balance >= amount) {
        this.balance = this.balance + amount;
    } else {
        this.balance = 150.00; 
    }
} else {
        this.balance = this.balance+0.00;  
    }

}

    
}
