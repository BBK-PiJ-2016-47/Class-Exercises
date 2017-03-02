/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package genericlists;

/**
 *
 * @author spencerh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Company invisibleInc = new Company();
       
        invisibleInc.names.addItem("Bruce");
        invisibleInc.names.addItem("Diana");
        invisibleInc.names.addItem("Alan");
        invisibleInc.names.printList();
        invisibleInc.names.deleteItem("Diana");
        invisibleInc.names.deleteItem("Wonder Woman");
        invisibleInc.names.printList();

        invisibleInc.niNumber.addItem(47);
        invisibleInc.niNumber.addItem(937);
        invisibleInc.niNumber.addItem(135);
        invisibleInc.niNumber.addItem(94);
        invisibleInc.niNumber.addItem(89);
        invisibleInc.niNumber.printList();
        invisibleInc.niNumber.deleteItem(135);
        invisibleInc.niNumber.deleteItem(4);
        invisibleInc.niNumber.printList();
        
    }

}
