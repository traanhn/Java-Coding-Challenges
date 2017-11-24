/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 */
import java.util.HashMap;
import java.util.ArrayList; 

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners ;
    
    public VehicleRegister() {
    this.owners = new HashMap<RegistrationPlate, String>();

}
    
    
    public boolean add(RegistrationPlate plate, String owner){
            if(owners.get(plate) == null){
                
                owners.put(plate, owner);

                return true;
            }
            return false; 
    }
    
    public String get(RegistrationPlate plate){
        return owners.get(plate); 
    }
    public boolean delete(RegistrationPlate plate){
        if(owners.get(plate) == null){
            return false;
        } else {
            owners.remove(plate); 
        }
        return true;
    }
    
    
    public void printRegistrationPlates(){
        for( RegistrationPlate key : owners.keySet()){
            System.out.println(key);
        }
    }
    
    public void printOwners(){
                ArrayList<String> owner = new ArrayList<String>();
        
        for (RegistrationPlate key : owners.keySet()) {
            String ownerName = owners.get(key);
            if (!owner.contains(ownerName)) {
                owner.add(ownerName);
            }
        }
        
        for (String name : owner) {
            System.out.println(name);
        }
    }
}
