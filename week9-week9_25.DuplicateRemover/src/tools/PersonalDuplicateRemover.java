/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author traanh
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    
    private Set<String> list;
    private int duplicate; 
    public PersonalDuplicateRemover(){
        this.list = new HashSet<String>();
        this.duplicate = 0;
    }
    
    
    @Override
    public void add(String characterString) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(!this.list.contains(characterString)){
            this.list.add(characterString);
            
        } else {
            this.duplicate++; 
        }
    
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        return this.duplicate;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.list; 
    }

    @Override
    public void empty() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.list.clear();
        this.duplicate = 0; 
    
    }
    
}
