/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 */
public class Player {
    private String playername;
    private int goal;
    
    public Player(String name){
     this.playername = name;   
    }
    public Player(String name, int goals){
        this.playername = name;
        this.goal = goals;
    }
    public String getName(){
        return this.playername;
    }
    public int goals(){
        return this.goal;
    }
    public String toString(){
        return this.getName() + ", goals " + this.goals(); 
    }
}
