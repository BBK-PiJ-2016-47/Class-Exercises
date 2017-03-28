
package noahsark;

public class Monkey extends LandAnimal{
    public Monkey(String name) {
        super(name, "Mammal");
    }

    @Override
    public void makeSound() {
        System.out.println("Makes awful hooting");
    }
}
