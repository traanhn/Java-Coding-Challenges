/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author traanh
 */
public class OneThingBox extends Box{
    private List<Thing> list;
    
    public OneThingBox(){
        this.list = new ArrayList<Thing>();
    }
    
    @Override
    public void add(Thing thing) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(this.list.isEmpty()){
            this.list.add(thing);
        }
    
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(Thing t : this.list){
            if(t.equals(thing)){
                return true;
            }
        }
        return false; 
    
    }
    
}
