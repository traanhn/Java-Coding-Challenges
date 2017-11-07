import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for ( int i : list) {
            sum += i;
        }
        
        return sum;
      
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return (double)sum(list)/list.size(); 
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        /*double b =0.0;
        for (int i: list) {
        b += Math.pow((i-average(list)), 2.0);
        }
        return (double)b/(list.size()-1) ;
        }*/
        

    double a = average(list);
    double b =0.0;
    for (int i :list){
        b += Math.pow(i-a,2.0);
    }
   
    return b/(list.size()-1);
    }
    
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(3);
        list.add(5);
        
        System.out.println("The variance is: " + variance(list));
    }

}
