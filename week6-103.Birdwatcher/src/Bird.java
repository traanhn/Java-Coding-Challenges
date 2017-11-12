/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 */
public class Bird {
   private String name;
    private String latin;
    private int count;
    
    public Bird(String name, String latin){
        this.name = name;
        this.latin = latin;
        this.count = 0;
    }
    public String getName(){
        return this.name;
    }
    
    public String getlatin(){
        return this.latin;
    }
    
    public String toString(){
        return this.name + " ("+ this.latin +")"+ ": " + this.count +" observations" ;
    } 
    public int count(){
        this.count += 1;
        return this.count;
    }
}
