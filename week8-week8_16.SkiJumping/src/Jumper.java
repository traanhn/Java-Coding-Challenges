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

public class Jumper implements Comparable<Jumper>{
    private String name;
    private int point;
    private List<Integer> list;
    
    public Jumper(String name){
        this.name = name;
        this.point = 0; 
        this.list = new ArrayList<Integer>();
    }
    public String getName(){
        return this.name;
    }
    public int getPoint(){
        return this.point;
    }
    public void addPoint(int point){
        this.point += point; 
    }
    
    public void addJump(int jlength){
        this.list.add(jlength);
    }
    public void printJumpLength(){
        String formattedString = this.list.toString().replace("[", "").replace(",", " m,").replace("]", " m");
        System.out.print("            jump lengths: " + formattedString);
    }
    
    @Override
    public int compareTo(Jumper o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.point - o.point;     
    
    }
    public String toString(){
        return this.name + " (" + this.point +" points)"; 
    }
    
    
}
