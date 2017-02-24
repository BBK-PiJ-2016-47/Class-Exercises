/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package doublylinkedlist;

/**
 *
 * @author spencerh
 */
public class HospitalManager03 {

    	private Patient head = null; //first patient
        private Patient tail = null; //last patient
        private Patient current = null; //traverser
	private boolean finished = false;
	private int count = 0;


        public void addPatient(Patient newPatient) {
            //if this is the first patient
            if (head == null) {
		head = newPatient;
		System.out.println("Patient " + newPatient.getName() + " has been added");
                count++;
		return;
            }
            
            current = this.head;
            while(current.getNextPatient() != null) {
                current = current.getNextPatient();
            }
            current.setNextPatient(newPatient);
            tail = current.getNextPatient();
            newPatient.setPreviousPatient(current);

            count++;
            System.out.println("Patient " + newPatient.getName() + " has been added");
        }

        public void deletePatient(String name) {
            if (head == null) {
                System.out.println("There are no patients to delete!");
                return;
            }
           //if first person
            current = this.head;
            if (current.getName().equals(name)) {
                head = head.getNextPatient();
                System.out.println(name + " has been deleted");
            }
            
            while(current.getNextPatient() != null  && current.getNextPatient().getName() != name) {
                current = current.getNextPatient();
            }

            if (current.getNextPatient() == null) {
                System.out.println(name + " wasn't found!");
            } else {
                tail = current.getNextPatient().getNextPatient();
                if (tail != null) {
                   tail.setPreviousPatient(tail.getPreviousPatient().getPreviousPatient());
                }
                current.setNextPatient(current.getNextPatient().getNextPatient());
                System.out.println(name + " has been deleted");
            }
    }



        public void printPatientList(){
            if (head == null) {
		System.out.println("No patients in the hospital!");
		return;
            }

            current = this.head;
            do {
                System.out.println("Name   : " + current.getName());
		System.out.println("Illness: " + current.getIllness());
		System.out.println("Age    : " + current.getAge());
                current = current.getNextPatient();

            } while(current != null) ;

        }

        public void printPatientListBackwards(){
            if(head == null) {
                System.out.println("No patients in the hospital!");
		return;
            }
            current = this.head;
            while (current.getNextPatient() != null){
                current = current.getNextPatient();
            }
            do {
                System.out.println("Name   : " + current.getName());
		System.out.println("Illness: " + current.getIllness());
		System.out.println("Age    : " + current.getAge());
                current = current.getPreviousPatient();
            } while(current != null);

        }


}
