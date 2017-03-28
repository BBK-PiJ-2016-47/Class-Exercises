

package noahsark;


public class Whale extends AquaticAnimals{
    public Whale(String name) {
        super(name, "Mammal");
    }

    @Override
    public void makeSound() {
        System.out.println("NNNNNYYyyyyuuuuurrrrrr");
    }
}
