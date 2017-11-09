/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 */
import java.util.ArrayList;

public class Team {
    private String team;
    private ArrayList<Player> list;
    private int max;
    
    public Team(String name){
        this.team = name;
        this.list = new ArrayList<Player>();
        this.max = 16;
        
    } 
    public String getName(){
        return this.team;
    }
    public void addPlayer(Player player){
        
        if( this.list.size() < this.max){
            this.list.add(player);
        
        }
         
    }
    public void printPlayers(){
        for( Player i : this.list){
            System.out.println(i);
        }
    }
    public void setMaxSize(int maxSize){
        this.max = maxSize;
    }
    
    
    public int size(){
        return this.list.size(); 
    }
    public int goals(){
        int sum = 0;
        for ( Player i : this.list){
            sum  = sum + i.goals(); 
        } return sum; 
    } 
}
