/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package queue;

/**
 *
 * @author spencerh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackImpl test = new StackImpl();

        test.empty();
        test.push(5);
        test.push(7);
        test.push(15);
        test.print();
        test.push(98);
        test.push(64);
        test.push(23);
        test.print();
        test.pop();
        test.print();
        test.pop();
        test.print();
    }

}
