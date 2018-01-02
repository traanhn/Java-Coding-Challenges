/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 * 
 * 
 */

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private JumperList jumpers;
    
    public TextUserInterface(){
        this.reader = new Scanner(System.in);
        this.jumpers = new JumperList();
    }
    
    public void start(){
        this.getJumper();
        this.round();
        this.result();
    }
    public void getJumper(){
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        
        while(true){
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            
            if(name.isEmpty()){
                break; 
            }
            Jumper j = new Jumper(name); 
            this.jumpers.add(j);
            
        }
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");
    }
    
    public void round(){
        int round = 1;
        while(true){
        System.out.print("Write \"jump\" to jump; otherwise you quit: ");
        String command = reader.nextLine();
        if(command.equals("quit")){
            break;
        }
        else if(command.equals("jump")){
            System.out.println();
            System.out.println("Round " + round);
            System.out.println();
            this.jumpers.sort();
            
            System.out.println("Jumping order: ");
            this.jumpers.printJumperOrder();
            System.out.println();
            System.out.println("Result of round " + round);
            this.jumpers.play();
            System.out.println();
            round++; 
        }
        
        }
        System.out.println();
        System.out.println("Thanks!");
        System.out.println();
        
    
}
    public void result(){
        this.jumpers.sort();
        this.jumpers.reverse();
        System.out.println("Tournament results: ");
        this.jumpers.printResults();
    }
    
}

