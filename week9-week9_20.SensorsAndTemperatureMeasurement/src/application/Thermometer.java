/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.Random; 

/**
 *
 * @author traanh
 */
public class Thermometer implements Sensor {
    private final Random random;
    private Boolean turn; 
    
    public Thermometer(){
        
        this.random = new Random(); 
        this.turn = false; 
    }

    @Override
    public boolean isOn() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.turn; 
    }

    @Override
    public void on() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.turn = true; 
    }

    @Override
    public void off() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.turn = false; 
    }

    @Override
    public int measure() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(!this.isOn()){
            throw new IllegalArgumentException("No Valid");    
        } else {
            int number = this.random.nextInt(61) - 30 ; 
            return number; 
        }
        
    }
    
}
