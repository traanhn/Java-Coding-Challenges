
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    private static void printWithSmileys(String characterString){
        if(characterString.length() % 2 == 0){    
            int times = (characterString.length() + 6)/2;
            int i = 0;
            int j = 0;
            while(i <times){
                System.out.print(":)");
                i++; 
            }
            System.out.println("");
            
            System.out.println(":) "+characterString+" :)");
            
            while(j < times){
                System.out.print(":)");
                j++;
            }
            System.out.println("");
        }
        else {
            int times = (characterString.length() + 6)/2 + 1;
            int i = 0;
            int j = 0;
            while(i <times){
                System.out.print(":)");
                i++; 
            }
            System.out.println("");
            
            System.out.println(":) "+characterString+"  :)");
            
            while(j < times){
                System.out.print(":)");
                j++;
            }
            System.out.println("");            
            }
}
}

