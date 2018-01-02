/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author traanh
 */
public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String owner, Barn barn){
        this.barn = barn;
        this.owner = owner;
        this.cows = new ArrayList<Cow>(); 
        
    }
    public void manageCows(){
        this.barn.takeCareOf(this.cows);
              
    }
    public void addCow(Cow cow){
        this.cows.add(cow);
    }
    public String getOwner(){
        return this.owner;
    }
    public void installMilkingRobot(MilkingRobot robot){
        this.barn.installMilkingRobot(robot);
    }
    
    
    @Override
    public void liveHour() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(Cow c : this.cows){
            c.liveHour();
        }
    
    }
    public String toString(){
        if(this.cows.isEmpty()){
            return "Farm owner: " + this.owner + "\n" + "Barn bulk tank: " + this.barn.toString() + "\n" + "No cows.";
        } else{
            String print = "Farm owner: " + this.owner + "\n" + "Barn bulk tank: " + this.barn.toString() + "\n" + "Animals:" +"\n";
            for(Cow c : this.cows){
                print += "      "+c.toString()+"\n";
            }
            return print; 
        }
    }
    
}
