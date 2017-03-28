
package noahsark;


public class FlyingAnimal implements Animal {
    private String name;

    public FlyingAnimal(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println(name + " now flying, will come later when tired...");
    }

    @Override
    public void reproduce() {
        layEggs();
    }

    @Override
    public void makeSound() {
        System.out.println(name + " is making a sound");
    }

    public void layEggs(){
        System.out.println(name + " is laying eggs");
    }

    public String getName() {
        return this.name;
    }
}
