/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package simplemapproject;

/**
 *
 * @author spencerh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleMap testing = new SimpleMapImpl();
        System.out.println(testing.isEmpty());
        testing.put(0, "Pizza");
        testing.put(1, "Mount Everest");
        testing.put(2, "Whales");
        testing.put(3, "Shanties");
        testing.put(2, "This one shouldn't work");
        System.out.println(testing.isEmpty());
        System.out.println(testing.get(1));
        testing.remove(3);
        System.out.println(testing.get(3));

    }

}
