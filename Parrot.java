public claas Parrot extends Pet { // #3 anpther subclass of Pet superclass
    private String jungle;
    public Parrot(String name, double weight, String jungle) {
        // call the superclass constructor and pass the name and weight parameters
        super(name, weight);
        this.jungle = jungle;
    }
    @override
    public String makeSound() { // overriding the superclass method 'makeSound'
        return "Hello!!!";
    public String getJungle() {
        return jungle;
    }
    public void setJungle(String jungle) {
        this.jungle = jungle;
    }
}  
