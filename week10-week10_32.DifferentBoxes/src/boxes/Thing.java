package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {

        this.name = name;
        
        if(weight >= 0){
            this.weight = weight;
        } else {
            throw new IllegalArgumentException(); 
        }
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    public boolean equals(Object obj){
        if(obj == null){
            return false; 
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Thing thing = (Thing) obj;
        if(this.name == null || !this.name.equals(thing.name)){
            return false;
        }
        return true;
    }
    public int hashCode(){
        if(this.name == null){
            return 7;
        } 
        return this.name.hashCode();
        
    }

}
