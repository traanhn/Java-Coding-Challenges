/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.List;
import java.util.ArrayList; 

/**
 *
 * @author traanh
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensors; 
    private List<Integer> readings; 
    public AverageSensor(){
        this.sensors = new ArrayList<Sensor>(); 
        this.readings = new ArrayList<Integer>(); 
        
    }
    public void addSensor(Sensor additional){
        this.sensors.add(additional); 
    }
    public List<Integer> readings(){
        return this.readings; 
    }
    @Override
    public boolean isOn() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(Sensor i : this.sensors){
            if(!i.isOn()){
                return false; 
            }  
        }
        return true; 
    }

    @Override
    public void on() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(Sensor i : this.sensors){
            
                i.on();
            }
        }
        
    

    @Override
    public void off() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(Sensor i: this.sensors){
            i.off();
        }
    }

    @Override
    public int measure() {
        int sum = 0; 
        int average = 0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if( !this.isOn() || this.sensors.isEmpty()){
            throw new IllegalStateException("No valid"); 
        } else {
            for(Sensor i : this.sensors){
                sum += i.measure();
                
            }
            average = sum/this.sensors.size(); 
            this.readings.add(average); 
            return average; 
        }
    }
    
    
}
