import java.util.Scanner;
import java.util.ArrayList; 

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
          
        Scanner reader = new Scanner(System.in); 
        ArrayList<Bird> list = new ArrayList<Bird>(); 
        
              while(true){
              System.out.print("? ");
              
              
              
              String command = reader.nextLine();
              if(command.equals("Add")){
                  
                  System.out.print("Name: ");
                  String name = reader.nextLine();
                  System.out.print("Latin Name: ");
                  String latin = reader.nextLine();
                  Bird bird = new Bird(name, latin);
                  list.add(bird);
                  
              } else if(command.equals("Observation")){
                  System.out.print("What was observed:? ");
                  String observed = reader.nextLine();
                  
                  for(Bird enter : list){
                      if(enter.getName().equals(observed)){
                          enter.count();
                      } else {
                          System.out.println("Is not a bird!");
                      }
                  }
                  
              } else if (command.equals("Statistics")){
                  for(Bird i : list){
                      System.out.println(i );
                  }
                  
              } else if (command.equals("Show")){
                  System.out.print("What?");
                  String order = reader.nextLine();
                  for(Bird i :list){
                      if(i.getName().equals(order)){
                         System.out.println(i ); 
                      }
                  }
                  
              } else if (command.equals("Quit")){
                  break;
              }
          }
        
    }
 
}
