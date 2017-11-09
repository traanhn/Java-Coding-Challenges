/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 */
public class Student {
    private String name;
    private String number;
    
    public Student(String name, String number){
        this.name = name;
        this.number = number;
    }
    public String getName(){
        return this.name;
    }
    
    public String getStudentNumber(){
        return this.number;
    }
    
    public String toString(){
        return this.name + " ("+ this.number +")";
    }
}
