

package noahsark;

public class Beetle extends FlyingAnimal{

    public Beetle(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Makes gross beetly scritchy scratchy noise");
    }
}
