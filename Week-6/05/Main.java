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
        QueueImpl test = new QueueImpl();
        test.retrieve();
        test.size();
        test.insert(50);
        test.insert(15);
        test.insert(21);
        test.retrieve();
        test.insert(19);
        test.insert(87);
        test.insert(212);
        test.retrieve();
        test.retrieve();
    }

}
