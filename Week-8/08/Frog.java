
package noahsark;


public class Frog extends AquaticAnimals {

    public Frog(String name) {
        super(name, "Amphibian");
    }

    @Override
    public void makeSound() {
        System.out.println("Ribbit ribbit");
    }
}
