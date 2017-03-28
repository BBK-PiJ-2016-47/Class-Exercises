

package noahsark;


public class Lizard extends LandAnimal{
    public Lizard(String name) {
        super(name, "Reptile");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " doesn't like to make a fuss.");
    }
}
