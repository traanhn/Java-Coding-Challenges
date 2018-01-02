/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author traanh
 */
public class WordInspection {
    
    private File file;
    private List<String> words;
    
    public WordInspection(File file){
        this.file = file;
        this.words = new ArrayList<String>(); 
    }
    public int wordCount() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file, "UTF-8");
        int count = 0; 
        while(reader.hasNextLine()){
            String s = reader.nextLine();
            count++;
            
        }
        return count;
    }
    public List<String> wordsContainingZ() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file, "UTF-8");
        
        while(reader.hasNextLine()){
            String s = reader.nextLine();
            if(s.contains("z")){
                this.words.add(s);
            }
            
   
        }
        return this.words; 
    }
    
    public List<String> wordsEndingInL() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file,"UTF-8");
        while(reader.hasNextLine()){
           String s = reader.nextLine();
           if(s.endsWith("l")){
               this.words.add(s);
               
           }
        }
            return this.words; 
    
}
    public List<String> palindromes() throws FileNotFoundException {
        List<String> palindromes = new ArrayList<String>();
        Scanner reader = new Scanner(this.file, "UTF-8");
        while(reader.hasNextLine()){
            String s = reader.nextLine();
            if(s.equalsIgnoreCase(reverse(s))){
               palindromes.add(s);
            }
        }
     
        return palindromes; 
        
        
    }
    
    public String reverse(String word){
        String reverse = "";
        for(int i = word.length() - 1; i >= 0; i--){
            reverse += word.charAt(i);
        }
        
        return reverse; 
    }
        
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file,"UTF-8");
        while(reader.hasNextLine()){
            String s = reader.nextLine();
            if(s.contains("a") && s.contains("e") && s.contains("i")&& s.contains("o") && s.contains("u") && s.contains("y") && s.contains("ä") && s.contains("ö")){
                this.words.add(s);
            }
        
        }
        return this.words;
    }
}



