/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author traanh
 */
public class Group implements Movable{
    private List<Movable> list; 
    public Group(){
        this.list = new ArrayList<Movable>();
    }
    public String toString(){
        String groups = "";
        
        for(Movable m : this.list){
            groups += m.toString();
            groups += "\n"; 
            
        }
        return groups;
        
    }
    public void addToGroup(Movable movable){
        this.list.add(movable);
    }
    
    
    @Override
    public void move(int dx, int dy) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(Movable m: this.list){
            m.move(dx, dy);
        }
    }
    
}
