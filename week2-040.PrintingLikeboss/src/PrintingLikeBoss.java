public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
    
        while(amount>0) {
        System.out.print("*");
        amount--; }
        System.out.println("");
    
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while(amount>0) {
        System.out.print(" ");
        amount--; }
    }

    public static void printTriangle(int size) {
        // 40.2
       int a = 1;
       while ( a <= size){
           printWhitespaces(size-a);
           printStars(a);
           a++;
       }
    }

    public static void xmasTree(int height) {
        // 40.3 int a = 1;
        int a = 1;
        int b = height - 1; 
        while ( b >= 0){
            printWhitespaces(b);
            b--;
            printStars(a);
            a += 2;
        }
        int c = 0; 
        while(c <=1){
        printWhitespaces(height-2);
        printStars(3);
        c++;
        
    }
       
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
