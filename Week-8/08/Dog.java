
package noahsark;


public class Dog extends LandAnimal{
    public Dog(String name) {
        super(name, "Mammal");
    }

    @Override
    public void makeSound() {
        System.out.println("Ruff ruff ruff");
    }
}
