/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sortedlist;

/**
 *
 * @author spencerh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TheList testing = new TheList();
       testing.printWholeList();
       testing.addItem(5);
       testing.addItem(2);
      testing.addItem(7);
      testing.addItem(6);
      testing.addItem(1);
      testing.addItem(473);
      testing.addItem(15);
      testing.addItem(12);
      testing.addItem(48);

       testing.printWholeList();
    }

}
