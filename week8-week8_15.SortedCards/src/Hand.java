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
import java.util.Collection;
import java.util.Collections;


public class Hand implements Comparable<Hand> {
    private ArrayList<Card> list ; 
    public Hand(){
        this.list = new ArrayList<Card>(); 
    }
    public void add(Card card){
        this.list.add(card);
    }
    public void print(){
        for ( Card card : this.list){
            System.out.println(card);
        }
    }
    public void sort(){
        Collections.sort(this.list);
    }

    @Override
    public int compareTo(Hand o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int sum1 = 0;
        int sum2 = 0;
        for ( Card card1 : this.list){
            sum1 += card1.getValue();
        }
        for (Card card2 : o.list){
            sum2 += card2.getValue(); 
        }
        return sum1 - sum2; 
    
    }
    public void sortAgainstSuit(){
        
        Collections.sort(this.list, new SortAgainstSuitAndValue() );

    }
    
}
