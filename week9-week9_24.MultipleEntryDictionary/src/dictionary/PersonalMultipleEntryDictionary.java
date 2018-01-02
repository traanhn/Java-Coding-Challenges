/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author traanh
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{

    private Map<String, Set<String>> list;
    
    public PersonalMultipleEntryDictionary(){
        this.list = new HashMap<String, Set<String>>();
        
    }
    
    
    @Override
    public void add(String word, String entry) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(!this.list.containsKey(word)){
            this.list.put(word, new HashSet<String>()); 
        }
        this.list.get(word).add(entry);
    
    }

    @Override
    public Set<String> translate(String word) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.list.get(word); 
    
    }

    @Override
    public void remove(String word) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
            this.list.remove(word);
        
    
    }
    
}
