/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections; 

/**
 *
 * @author traanh
 */
public class ContainerHistory {
    
    private List<Double> history; 
    
    public ContainerHistory(){
        this.history = new ArrayList<Double>(); 
    }
    public void add(double situation){
        this.history.add(situation);
        
    }
    
    public void reset(){
        this.history.clear();
    }
    public String toString(){
        return this.history.toString(); 
    }
    
    public double maxValue(){
        return Collections.max(this.history);
    }
    
    public double minValue(){
        return Collections.min(this.history);
    }
    
    public double average(){
       
        double sum = 0.0; 
        if(this.history.isEmpty()){
            return 0.0;
        } else{
            
            for(double value : this.history){
                sum += value; 
                }
            }
        
        return sum/this.history.size(); 
    }
    public double greatestFluctuation(){
        List<Double> fluctuations = new ArrayList<Double>();
        double max = 0.0;
        if(this.history.size() == 1 || this.history.isEmpty()){
            return 0.0;
        } else {
            for(int i = this.history.size()-1; i >= 1;i-- ){
                double fluctuation = Math.abs(this.history.get(i)-this.history.get(i-1));
                fluctuations.add(fluctuation); 
            }   
        }
        for(double f: fluctuations){
            if(max < f){
                max = f;
            }
        }
        return max;
    }
    public double variance() {
        double mean = average();
        double sum = 0;

        for (double value : this.history) {
            sum += Math.pow((value - mean), 2);
        }
        return sum / (this.history.size() - 1);
    }
}

