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
import java.util.List;
import java.util.Random;
import java.util.Collections; 


public class JumperList {
    private List<Jumper> jumpers;
    private Random random = new Random();
    
    public JumperList(){
        this.jumpers = new ArrayList<Jumper>();
        
    }
    public void add(Jumper jumper){
        this.jumpers.add(jumper); 
    }
    public void sort(){
        Collections.sort(this.jumpers);
    }
    public void reverse(){
        Collections.reverse(this.jumpers);
    }
    public void printJumperOrder(){
        for(int i = 0; i < this.jumpers.size(); i++){
            int index = i+ 1;
            System.out.println("  " + index + ". " + this.jumpers.get(i));
        }
    }
    
    public void play(){
        for(Jumper j : this.jumpers){
            int jLength = random.nextInt(120-60+1)+ 60;
            j.addJump(jLength);
            List<Integer> judges = new ArrayList<Integer>();
            for(int i = 0; i <= 5; i++){
                int score = random.nextInt(20 - 10 + 1) + 10;
                judges.add(score); 
            }
            System.out.println("  " + j.getName());
            System.out.println("    length: " + jLength);
            System.out.println("    judge votes: " + judges);
            Collections.sort(judges);
            judges.remove(0);
            judges.remove(judges.size()-1);
            int sumScore =0;
            for( int i : judges){
                sumScore += i; 
            }
            int point = sumScore + jLength; 
            j.addPoint(point);
            
            
        }
        
    }
    public void printResults(){
        
        System.out.println("Position    Name");
        int index = 1;
        for (Jumper j : this.jumpers){
            System.out.println(index+ "           "+j);
            j.printJumpLength();
            index++; 
            System.out.println();
            
        }
        
        
    }
    
    
            
            
}
