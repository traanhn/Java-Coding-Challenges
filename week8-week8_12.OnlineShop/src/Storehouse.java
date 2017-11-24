/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 */

import java.util.HashMap; 
import java.util.Map; 
import java.util.Set;
import java.util.HashSet; 

public class Storehouse {
    private Map<String, Integer> price; 
    private Map<String, Integer> stock; 
    public Storehouse(){
        this.price = new HashMap<String, Integer>();
        this.stock = new HashMap<String, Integer>();
        
    }
    
    public void addProduct(String product, int price, int stock){
        this.price.put(product, price);
        this.stock.put(product,stock); 
    }
    
    public int price(String product){
        for(String key: this.price.keySet()) {
            
            if(key.equals(product)){
                return this.price.get(key);
            } 
               
        } return -99; 
        
    }
    
    public int stock(String product){
        for(String key: this.stock.keySet()) {
            
            if(key.equals(product)){
                return this.stock.get(key);
            } 
               
        } return 0; 
        
    }
    
    public boolean take(String product){
        for( String key : this.stock.keySet()){
            if(key.equals(product)){
                if(this.stock(product) > 0){
                    this.stock.put(product,this.stock(product)- 1); 
                    return true;
                }
                
            }
        }
        return false; 
    }
    
    public Set<String> products(){
        Set<String> set = new HashSet<String>();
            for(String key : this.price.keySet()){
                set.add(key); 
            }
            return set; 
}
}
