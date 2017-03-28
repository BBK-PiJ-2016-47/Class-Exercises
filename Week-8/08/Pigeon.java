

package noahsark;


public class Pigeon extends FlyingAnimal{
    public Pigeon(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("CooOOOooOOOooO");
    }
}
