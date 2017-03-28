

package noahsark;


public class Cat extends LandAnimal{
    public Cat(String name) {
        super(name, "Mammal");
    }

    @Override
    public void makeSound() {
        System.out.println("Mewwwwwwwl");
    }
}
