
package noahsark;


public class AquaticAnimals implements Animal{
    private String name;
    private String type;
    
    public AquaticAnimals(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    @Override
    public void call() {
        System.out.println(name + " will not come...");
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

    public String getName() {
        return this.name;
    }

    public void layEggs(){
        System.out.println(name + " is laying eggs");
    }

    public void giveBirth() {
        System.out.println(name + " is giving birth");
    }
}
