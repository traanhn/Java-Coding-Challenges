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

public class Container {
    private int max; 
    private ArrayList<Suitcase> list; 
    private int sum;
public Container(int max){    
    this.max = max; 
    this.list = new ArrayList<Suitcase>();
    this.sum = 0; 
}  
public void addSuitcase ( Suitcase suitcase){
   
        int weight = totalWeight();
        weight += suitcase.totalWeight();
        if (weight <= this.max) {
            this.list.add(suitcase);
        }
}

public String toString(){
    int sum =0; 
    int count =0;
    for ( Suitcase suitcase : this.list) {
        sum = sum + suitcase.totalWeight();
        count++; 
    }
    return this.list.size() + " suitcases (" + sum + " kg)"; 
}

public void printThings() {
    for (Suitcase suitcase : this.list) {
        suitcase.printThings();
    }
        
}

public int totalWeight() {
        int weight = 0;
        for (Suitcase ss : this.list) {
            weight += ss.totalWeight();
        }
        return weight;
    }

  }

