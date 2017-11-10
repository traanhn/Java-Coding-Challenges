
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
       int mcents = this.cents + added.cents; 
       int meuros = this.euros + added.euros;
       
       Money c = new Money( meuros, mcents); 
        
        return c; 
    }
    
    public boolean less(Money compared){
        if (this.euros < compared.euros) {
            return true;
        } if ( this.euros == compared.euros && this.cents < compared.cents){
            return true;
        } return false;
    }
    
    public Money minus(Money decremented){
        int mcents =0; 
        int meuros =0; 
        
        if(this.euros < decremented.euros) {
            mcents = 0; 
            meuros =0; 
        } 
        else if(this.euros > decremented.euros && this.cents < decremented.cents) {
            mcents = this.cents + 100 - decremented.cents; 
            meuros = this.euros - decremented.euros -1 ; 
        } else { 
        mcents = this.cents - decremented.cents; 
        meuros = this.euros - decremented.euros; 
        
    }Money result = new Money( meuros, mcents);
            return result ;

}
}

