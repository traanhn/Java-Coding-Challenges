/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.value = 0; 
        this.upperLimit = upperLimit; 
        
    }

    public void next() {
        // write code here
        if (this.value + 1 > this.upperLimit) {
            this.value = 0; 
        } else {
        this.value = this.value + 1; 
        } 
        
    }

    public String toString() {
        // write code here
        if(this.value < 10){
        return "0" + this.value ; 
        } else { 
            return "" + this.value; 
        }
        
    }
    public int getValue(){
        return this.value; 
    }
    public void  setValue(int x){
        if(x <= this.upperLimit && x>= 0){
            this.value = x; } 
        
    }
}
