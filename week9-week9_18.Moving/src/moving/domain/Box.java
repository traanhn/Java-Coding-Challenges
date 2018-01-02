/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;
import java.util.ArrayList; 
import java.util.List;

/**
 *
 * @author traanh
 */
public class Box implements Thing {
    private final int max;
    private List<Thing> list; 
    
    
    public Box(int maximumCapacity){
        this.max = maximumCapacity;
        this.list = new ArrayList<Thing>(); 
    }

    public Box(Box box) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean addThing(Thing thing){
        if((getVolume() + thing.getVolume()) <= this.max){
            this.list.add(thing);
            return true;
        }
            return false; 
        
    }
    @Override
    public int getVolume() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int sum =0; 
        for(Thing i : this.list){
            sum += i.getVolume(); 
    }
        return sum;  
}
}
