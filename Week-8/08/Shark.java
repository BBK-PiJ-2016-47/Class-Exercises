

package noahsark;


public class Shark extends AquaticAnimals {
    public Shark(String name) {
        super(name, "Fish");
    }

    @Override
    public void makeSound() {
        System.out.println("Dun dun dun dun");
    }
}
