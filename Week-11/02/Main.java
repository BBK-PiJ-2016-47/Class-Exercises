/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package treesassets;

/**
 *
 * @author spencerh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeIntSet test = new TreeIntSet(2);
        test.add(34);
        test.add(2);
        test.add(143);
        test.add(19);
        test.add(7);

        System.out.println(test.contains(34));
        System.out.println(test.contains(25));
        System.out.println(test.containsVerbose(25));
        System.out.println(test.containsVerbose(2));

        ListIntSet testList = new ListIntSet(2);
        testList.add(1);
        testList.add(67);
        testList.add(29);
        testList.add(7);
        testList.add(34);

        System.out.println(testList.contains(1));
        System.out.println(testList.contains(67));
        System.out.println(testList.contains(7));
        System.out.println(testList.containsVerbose(29));
        System.out.println(testList.containsVerbose(34));

        System.out.println(testList.toString());
    }

}
