public class Reformatory {
   
    private int times;
    public int weight(Person person) {
        // return the weight of the person
        this.times++;
        return person.getWeight(); 
    }
    public void feed(Person person){
        
        person.setWeight(person.getWeight() + 1);

}
    public int totalWeightsMeasured() {
        return this.times;
    }
}