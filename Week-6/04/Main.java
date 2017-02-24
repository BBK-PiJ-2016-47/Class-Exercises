/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package circularlist;

/**
 *
 * @author spencerh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CircularList arrowPark = new CircularList();

        Patient toby = new Patient("Toby", 39, "social anxiety");
        Patient michael = new Patient("Michael", 55, "punched by employee");
        Patient pam = new Patient("Pam", 26, "alcohol-related injury at Chilis");
        Patient meredith = new Patient("Meredith", 46, "hit by Michael's car");
        Patient dwight = new Patient("Dwight", 35, "beet overdose");

        Patient jim = new Patient("Jim", 27, "prank-related injury");
        Patient stanley = new Patient("Stanley", 58, "diabetes");
        Patient angela = new Patient("Angela", 36, "cat attack");
        Patient kevin = new Patient("Kevin", 42, "crushed under chili pan");
        Patient andy = new Patient("Andy", 40, "broke hand punching wall");


        arrowPark.addPatient(toby);
        arrowPark.addPatient(michael);
        arrowPark.addPatient(pam);
        arrowPark.addPatient(meredith);
        arrowPark.addPatient(dwight);
        arrowPark.addPatient(jim);
        arrowPark.addPatient(stanley);
        arrowPark.addPatient(angela);
        arrowPark.addPatient(kevin);
        
        arrowPark.printPatientList();

        arrowPark.deletePatient("Toby");
       arrowPark.deletePatient("Angela");
       arrowPark.printPatientList();

       arrowPark.addPatient(andy);
       arrowPark.deletePatient("Oscar");
       arrowPark.printPatientList();
    }

}
