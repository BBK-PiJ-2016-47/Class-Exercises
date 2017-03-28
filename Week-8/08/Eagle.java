
package noahsark;

public class Eagle extends FlyingAnimal {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Screeches indeterminately");
    }
}
