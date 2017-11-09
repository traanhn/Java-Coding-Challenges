
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.value = 0; 
        this.upperLimit = upperLimit; 
        
    }

    public void next() {
        // write code here
        if (this.value + 1 > this.upperLimit) {
            this.value = 0; 
        } else {
        this.value = this.value + 1; 
        } 
        
    }

    @Override
    public String toString() {
        // write code here
        if(this.value < 10){
        return "0" + this.value ; 
        } else { 
            return "" + this.value; 
        }
        
    }
    public int getValue(){
        return this.value; 
    }
    public void  setValue(int x){
        if(x <= this.upperLimit && x>= 0){
            this.value = x; } 
        
    }

}
