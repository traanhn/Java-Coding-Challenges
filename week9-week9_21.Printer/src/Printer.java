
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 */
public class Printer {
    
    private String file;
    
    
    public Printer(String fileName) throws Exception{
        this.file = fileName;
        
    }
    public void printLinesWhichContain(String word) throws Exception{
        File f = new File(this.file); 
        Scanner reader = new Scanner(f); 
        while(reader.hasNextLine()){
            String s = reader.nextLine();
            if(s.contains(word)){
                System.out.println(s);
            }
    }
    reader.close();
}
}

