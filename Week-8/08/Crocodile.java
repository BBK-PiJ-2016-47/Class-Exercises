

package noahsark;


public class Crocodile extends AquaticAnimals{

    public Crocodile(String name) {
        super(name, "Reptile");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " is actually silently hunting rn");
    }
}
