public abstract class Pet { // #2 this is our superclass
   protected String name; // attributes are protected
   protected double weight;
   // constructor
   public Pet(String nmae, double weight) {
       this.name = name;
       this.weight = weight;
   }
   // this method will be overrriden by its subclass
   public abstract String makeSound();
   public String getName() {
       rewturn name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public double getWeight() {
       return weight;
   }
   public void setWeight(double weight) {
       this.weight = weight;
   }
}
