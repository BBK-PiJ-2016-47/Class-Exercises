/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package noahsark;

public class Fly extends FlyingAnimal{

    public Fly(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bzzzzzzz");
    }
}
