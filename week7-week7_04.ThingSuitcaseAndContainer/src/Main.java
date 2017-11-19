
public class Main {

   
        // use this main class to test your program!
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
    
    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        int i = 0;
        
        while(i <= 99) {
            Thing brick = new Thing("brick", i+1);
            Suitcase suitcase = new Suitcase(100);
            
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        i++;
    }
    
    }
}



