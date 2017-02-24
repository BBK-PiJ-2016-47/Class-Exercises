/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package multipleinheritance;

/**
 *
 * @author spencerh
 */
public class Guitar implements WoodenObject, MusicalInstrument {

    public void burn() {
        System.out.println("Fire!");
    }
    
    public void play() {
        System.out.println("ding ding ding");
    }
}