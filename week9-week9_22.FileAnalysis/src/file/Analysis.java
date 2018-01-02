/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author traanh
 */
public class Analysis  {
    private File file;
    public Analysis(File file) throws Exception{
        this.file = file;
    }
    public int lines() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file);
        int lines = 0;
        while(reader.hasNextLine()){
            String s = reader.nextLine();
            lines++;
        }
        reader.close();
        return lines; 
    }
    public int characters() throws Exception{
        Scanner reader = new Scanner(this.file);
        int characters = 0;
        while(reader.hasNext()){
            
            String word = reader.next();
            characters += word.length() + 1;
        }
        reader.close();
        return characters; 
    }
    
}
