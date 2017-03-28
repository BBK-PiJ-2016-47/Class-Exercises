
package noahsark;


public class Bear extends LandAnimal{
    public Bear(String name) {
        super(name, "Mammal");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Roars bearishly");
    }
}
