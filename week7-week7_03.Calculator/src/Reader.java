/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 */
import java.util.Scanner;

public class Reader {
    private Scanner reader; 
    
    
    public Reader() {
        this.reader = new Scanner(System.in);; 
    }
    
    public String readString(){
        String word = this.reader.nextLine();
        return word; 
    }
    public int readInteger(){
        int number = Integer.parseInt(this.reader.nextLine()); 
        return number; 
    }
}
