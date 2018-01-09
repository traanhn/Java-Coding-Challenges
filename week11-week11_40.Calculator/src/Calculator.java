/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 */
public class Calculator {
    
    private int value;
    
    public Calculator(){
        this.value = 0;
    }
    public int getValue(){      
        return this.value;
    }
    public void add(int number){
        this.value += number;
    }
    public void minus(int number){
        this.value -= number;
    }
    public void reset(){
        this.value =0;
    }
    
    
    
}
