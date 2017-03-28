
package noahsark;


public class Dolphin extends AquaticAnimals {
    
    public Dolphin(String name) {
        super(name, "Mammal");
    }

    @Override
    public void makeSound() {
        System.out.println("clickity clickity click");
    }
}
