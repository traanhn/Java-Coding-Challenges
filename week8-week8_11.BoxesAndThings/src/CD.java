/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 */
public class CD implements ToBeStored {
    private String title;
    private String artirst;
    private int year;
    public CD(String artist, String title, int year){
        this.artirst = artist;
        this.title = title;
        this.year = year;
    }

    @Override
    public double weight() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 0.1; 
    }
    
    public String toString(){
        return this.artirst + ": " + this.title +" (" + this.year +")"; 
    }       
}
