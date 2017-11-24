
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 */
public class Box implements ToBeStored{
    private double maxWeight;
    private ArrayList<ToBeStored> box; 
    public Box(double max){
        this.maxWeight = max; 
        this.box = new ArrayList<ToBeStored>();
    }
    public void add(ToBeStored thing){
        if(this.weight() + thing.weight() <= this.maxWeight){
            this.box.add(thing);
        }
    }
    @Override
    public double weight() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double sum = 0; 
        for(ToBeStored thing : this.box){
            sum += thing.weight(); 
        }
        return sum; 
    }
    
    
    public String toString(){
        return "Box: "+this.box.size()+" things, total weight "+this.weight()+" kg"; 

    }
    
    
}
