

package noahsark;


public class Snake extends LandAnimal{
    public Snake(String name) {
        super(name, "Reptile");
    }

    @Override
    public void makeSound() {
        System.out.println("HisSsssSSSSssssSSSS");
    }
}
