public class Printing {

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

    public static void printSquare(int sideSize) {
        // 39.2
        int a = 0;
        while (a < sideSize){
            printStars(sideSize);
            a++;
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
     
        int c = 0;
        while(c < height){
            printStars(width);
            c++; 
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int a = 1;
        while (a <= size){
            printStars(a);
            a++;
        }
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
