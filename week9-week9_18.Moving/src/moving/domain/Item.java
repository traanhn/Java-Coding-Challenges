/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author traanh
 */
public class Item implements Thing,Comparable<Item> {
    private String name;
    private int volume;
    
    public Item(String name, int volume){
        this.name = name;
        this.volume = volume; 
    }
    public String getName(){
        return this.name; 
    }
    public String toString(){
        return this.name+ " (" + this.volume+ " dm^3)";    
    }
    
    @Override
    public int getVolume(){
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.volume; 
    }

    @Override
    public int compareTo(Item o){
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.volume - o.volume; 
    }
    
    
}
