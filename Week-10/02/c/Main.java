
package hanoitowers;

/**
 *
 * @author spencerh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Hanoi han = new Hanoi();

       System.out.print("For 5 discs, you need this many moves: ");
       System.out.println(han.hanoi(5));
    }

}
