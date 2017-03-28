

package noahsark;


public class LandAnimal implements Animal{
    private String name;
    private String type;

    public LandAnimal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void call() {
        System.out.println(name + " is coming...");
    }

    @Override
    public void reproduce() {
      if (type.equals("Mammal")){
        giveBirth();
      } else {
          layEggs();
        }
    }

    @Override
    public void makeSound() {
        System.out.println(name + " is making a sound");
    }

    public void giveBirth() {
        System.out.println(name + " is giving birth");
    }

    public void layEggs(){
        System.out.println(name + " is laying eggs");
    }

    public String getName() {
        return this.name;
    }
}
