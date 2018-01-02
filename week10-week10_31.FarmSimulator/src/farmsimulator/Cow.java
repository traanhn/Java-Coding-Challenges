/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author traanh
 */
public class Cow implements Milkable, Alive{
    private String cowName;
    private double udderCapacity; 
    private double milkAmount;
    private Random random = new Random(); 
    
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    public Cow(){
        this.cowName = NAMES[random.nextInt(NAMES.length)];
        this.udderCapacity = 15 + random.nextInt(26); 
        this.milkAmount = 0;
        
    }
    public Cow(String name){
        this.cowName = name;
        this.udderCapacity = 15 + random.nextInt(26); 
        this.milkAmount = 0;
        
    }
    public String getName(){
        return this.cowName; 
    }
    public double getCapacity(){
        return this.udderCapacity;
        
    }
    public double getAmount(){
        return this.milkAmount; 
    }
    
    public String toString(){
        return this.cowName + " " +Math.ceil(this.milkAmount) +"/" + Math.ceil(this.udderCapacity); 
    }

    @Override
    public double milk() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double processedMilk = this.milkAmount;
        this.milkAmount = 0;
        return processedMilk; 
    }

    @Override
    public void liveHour() {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.milkAmount += (7 + random.nextInt(20 - 7 + 1)) / 10.0;
        if(this.milkAmount > this.udderCapacity){
            this.milkAmount = this.udderCapacity; 
        }   
    }
    
    
    
    
}
