
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 */
public class SortAgainstSuitAndValue implements Comparator<Card>{

    @Override
    public int compare(Card o1, Card o2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(o1.getSuit() - o2.getSuit()== 0){
            return o1.getValue()- o2.getValue() ;
        } else {
            return o1.getSuit() - o2.getSuit(); 
        }
    
    }
    
}
