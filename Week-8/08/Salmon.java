

package noahsark;


public class Salmon extends AquaticAnimals{
    public Salmon(String name) {
        super(name, "Fish");
    }

    @Override
    public void makeSound() {
        System.out.println("Glub glub");
    }
}
