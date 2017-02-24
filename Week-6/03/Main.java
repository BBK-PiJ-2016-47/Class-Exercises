/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package doublylinkedlist;

/**
 *
 * @author spencerh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HospitalManager03 arrowPark = new HospitalManager03();
        Patient john = new Patient("John", 29, "flu");
        Patient alice = new Patient("Alice", 92, "pizza addiction");
        Patient marco = new Patient("Marco", 43, "persistent entrepreneurial ideas");
        Patient meryl = new Patient("Meryl", 33, "obsessive compulsive excellence");
        Patient bethan = new Patient("Bethan", 55, "telekinesis");

        Patient leslie = new Patient("Leslie", 36, "over enthusiasm");
        Patient april = new Patient("April", 24, "sardonic overdose");
        Patient ron = new Patient("Ron", 47, "not enough bacon and eggs");
        Patient jerry = new Patient("Jerry", 62, "shut up, Jerry");
        Patient andy = new Patient("Andy", 33, "fell in a quarry");


        arrowPark.printPatientList();
        arrowPark.addPatient(john);
        arrowPark.addPatient(alice);
        arrowPark.addPatient(marco);
        arrowPark.addPatient(meryl);
        arrowPark.addPatient(bethan);
        arrowPark.addPatient(leslie);
        arrowPark.addPatient(april);
        arrowPark.addPatient(ron);
        arrowPark.addPatient(jerry);

        arrowPark.printPatientList();
        arrowPark.printPatientListBackwards();
      
        arrowPark.deletePatient("Alice");
        arrowPark.deletePatient("Jerry");

        arrowPark.printPatientList();
        arrowPark.printPatientListBackwards();

        arrowPark.addPatient(andy);
        arrowPark.deletePatient("Tom");

        arrowPark.printPatientList();
        arrowPark.printPatientListBackwards();
    }

}
