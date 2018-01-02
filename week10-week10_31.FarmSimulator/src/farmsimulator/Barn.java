/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author traanh
 */
public class Barn {
    private MilkingRobot robot; 
    private BulkTank bulkTank;
    public Barn(BulkTank tank){
        this.robot = null;
        this.bulkTank = tank; 
        
    }
    public BulkTank getBulkTank(){
        return this.bulkTank;
    }
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.robot = milkingRobot; 
        this.robot.setBulkTank(this.bulkTank);
    }
    public void takeCareOf(Cow cow){
        try{
            this.robot.milk(cow);
        }catch(Exception e){
            throw new IllegalStateException();
        }
    }
    public String toString(){
        return this.bulkTank.toString(); 
        
    }
    public void takeCareOf(Collection<Cow> cows){
        try{
            for(Cow c : cows){
                takeCareOf(c);
            }
        } catch(Exception e){
            throw new IllegalStateException();
        }
    }
}
