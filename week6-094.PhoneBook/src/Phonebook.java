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

public class Phonebook {
    
    private ArrayList<Person> list; 
    
    
    
    public Phonebook(){
        this.list = new ArrayList<Person>();
        
    }
    
    public void add(String name, String number){
        Person person = new Person(name, number);
        this.list.add(person);    
    }
    public void printAll(){
        for ( Person p : this.list){
            System.out.println(p);
        }
    }
    public String searchNumber(String name){
    for (Person p : this.list){
        if(p.getName().contains(name)){
            return p.getNumber();
        } 
    }return "number not known";
    
    }
}
