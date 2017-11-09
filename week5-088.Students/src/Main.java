
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    
        // write here the main program
        
        public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while(true){
        System.out.print("name: ");
        String nameenter = reader.nextLine();
        if(nameenter.equals("")){
            break;
        }
        System.out.print("studentnumber: ");
        String numberenter = reader.nextLine();
        Student studententer = new Student(nameenter, numberenter);
        list.add(studententer);
        
        }
        
        for( Student i : list){
            System.out.println(i);
        }
            System.out.print("Give search term: ");
            String searched = reader.nextLine();
            System.out.println("Result:");
            for( Student stu : list){
                if( stu.getName().contains(searched)){
                    System.out.println(stu);
                }
                    
            }
        
    }
    }
