import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        
        
        System.out.println("Type exam scores, -1 completes:");
        while(true){
        int enter = Integer.parseInt(reader.nextLine());
        if(enter == -1){
            break;
        }
        list.add(enter);
        }
        
        ArrayList<Integer> c0 = new ArrayList<Integer>();
        ArrayList<Integer> c1 = new ArrayList<Integer>();
        ArrayList<Integer> c2 = new ArrayList<Integer>();
        ArrayList<Integer> c3 = new ArrayList<Integer>();
        ArrayList<Integer> c4 = new ArrayList<Integer>();
        ArrayList<Integer> c5 = new ArrayList<Integer>();
        
        for (int point : list){
        
        if(point >=0 && point < 30) {
            c0.add(point);
        } else if (point < 35 && point >= 30) {
            c1.add(point);
        } else if (point < 40 && point >= 35) {
            c2.add(point);
        } else if (point < 45 && point >= 40) {
            c3.add(point);
        } else if (point < 50 && point >= 45) {
            c4.add(point);
        } else if (point < 61 && point >= 50) {
            c5.add(point);
        }
            
        }
        
        System.out.println("Grade distribution: ");
        System.out.print("5: ");
        printStars(c5.size());
        System.out.print("4: ");
        printStars(c4.size());
        System.out.print("3: ");
        printStars(c3.size());
        System.out.print("2: ");
        printStars(c2.size());
        System.out.print("1: ");
        printStars(c1.size());
        System.out.print("0: ");
        printStars(c0.size());
        double percentage = (double)(c5.size() + c4.size() + c3.size()+ c2.size()+ c1.size())*100/(c5.size() + c4.size() + c3.size()+ c2.size()+ c1.size()+ c0.size());
        System.out.println("Acceptance percentage" + percentage);
        
    }
    
    
    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times        
        while(amount>0) {
        System.out.print("*");
        amount--; }
        System.out.println("");

    
    }
    
    
    
}


