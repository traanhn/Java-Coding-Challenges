
import containers.ProductContainer;
import containers.ProductContainerRecorder;


public class Main {

    public static void main(String[] args) {
        // write test code here
    
  // the well known way:
        // the well known way:
ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
juice.takeFromTheContainer(11.3);
System.out.println(juice.getName()); // Juice
juice.addToTheContainer(1.0);
System.out.println(juice);           
// history() does not work properly, yet:
System.out.println(juice.history()); // [1000.0]
   

}
}

