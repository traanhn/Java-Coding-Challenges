import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {3, 2, 5, 4, 8};
System.out.println( Arrays.toString(values) );
swap(values, 1, 0);
System.out.println( Arrays.toString(values) );
swap(values, 0, 3);
System.out.println( Arrays.toString(values) );
int[] values1 = {8, 3, 7, 9, 1, 2, 4};
sort(values1);    
    
    }           
    public static int smallest(int[] array) {
    // write the code here
       int smallest = array[0]; 
        for(int i = 0; i < array.length ; i++){
            if(smallest > array[i]) {
                smallest = array[i]; 
            }
            
    }
        return smallest;
            
    }    
    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0]; 
        int index = 0;
        for(int i = 0; i < array.length ; i++){
            if(smallest > array[i]) {
                smallest = array[i]; 
                index = i; 
            }
            
    }
        return index;
       
}    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    // write the code here
        int smallest = array[index];
        int result = index;
        for(int i = index; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
                result = i;
            }
        } return result;
        
    }    
    public static void swap(int[] array, int index1, int index2) {
        int x = array[index1];
        int y = array[index2];
        array[index1] = y;
        array[index2] = x;
     }    
    public static void sort(int[] array) {
        
        for( int i = 0; i < array.length; i++){
        swap(array,indexOfTheSmallestStartingFrom(array, i),i); 
        System.out.println( Arrays.toString(array) ); 
        }
       
    }  
}

