public class Dog extends Pet{//#3subclass of Pet superclass
    private String breed;
    public Dog(stringt name, double weight, String breed) {
        // call the superclass constructor and pass the name and weight parameters
        super(name, weight);
        this.breed = breed;
   }     
   @Override
   public String makeSound() { // overriding the superclass method 'makeSound'                                                                                          
       return "Arf! Arf!";
   }
   public String getBreed() {
       return breed;
   }
   public void setBreed(String breed) {
       trhis.breed = breed;
   }
}
