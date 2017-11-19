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
public class Suitcase {
    private ArrayList<Thing> list; 
    private int maxWeight; 
    private int weight;
    
  public  Suitcase(int maxweight) {
      this.list = new ArrayList<Thing>(); 
      this.maxWeight = maxweight;
      this.weight = 0;
      
  }
  
  public void addThing(Thing thing) {
          int count = 0; 
          if ((this.weight + thing.getWeight())<= this.maxWeight) {
                this.list.add(thing); 
                this.weight = this.weight + thing.getWeight();
                count++;
  
  }
  }
  

  public String toString(){
      int sum =0;
      int count =0;
      for( Thing i : this.list) {
          sum = sum + i.getWeight(); 
          count++; 
      }
      if ( count ==0) {
          return "empty (0 kg) ";
          
      }
      if (count == 1) {
          return "1 thing (" + sum + " kg)"; 
          
      } else { 

      return count + " things (" + sum + " kg)"; 
             
  }
  }
  

  public  void printThings(){
      for( Thing i : this.list) {
          System.out.println(i); 
      }
  }
  
  public int totalWeight(){
 
        return this.weight;
  }
  
  public Thing heaviestThing(){
      int maxthing = 0; 
      
      Thing max = new Thing("", 0);
      
      if( this.list.isEmpty()) {
          return null; 
      } else {
            for (Thing i : this.list) {
                if (i.getWeight() > maxthing) {
                maxthing = i.getWeight();
                max =i; 
                }
            } 
        return max;
        }
  

  }    
}
