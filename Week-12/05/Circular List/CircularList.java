
package circularlist;

/**
 *
 * @author spencerh
 */
public class CircularList {

        private Patient head = null; //first patient
        private Patient current = null; //traverser
	private boolean repeating = false; //is true when head
	private int count = 0;

        public void addPatient(Patient newPatient) {
            if (head == null) {
		head = newPatient;
                newPatient.setNextPatient(newPatient);
		System.out.println("Patient " + newPatient.getName() + " has been added");
                count++;
                newPatient.setId(count);
		return;
            }

            current = this.head;
            while(current.getNextPatient().getId() != 1) {
                current = current.getNextPatient();
            }
            current.setNextPatient(newPatient);
            current.getNextPatient().setNextPatient(head);

            count++;
            System.out.println("Patient " + newPatient.getName() + " has been added");
            newPatient.setId(count);
        }

        public void deletePatient(String name){
            if (head == null) {
                System.out.println("There are no patients to delete!");
                return;
            }
           //if first person
            current = this.head;
            if (current.getName().equals(name)) {
                head = head.getNextPatient();
                head.setId(1);
                System.out.println(name + " has been deleted");
                return;
            }

            while(current.getNextPatient().getId() != 1  && current.getNextPatient().getName() != name) {
                current = current.getNextPatient();
            }

            if (current.getNextPatient().getId() == 1) {
                System.out.println(name + " wasn't found!");
                return;
            }
         
                current.setNextPatient(current.getNextPatient().getNextPatient());
                System.out.println(name + " has been deleted");
            
        }


        public void printPatientList(){
            if (head == null) {
		System.out.println("No patients in the hospital!");
                return;
            }

            current = this.head;
            do {
                System.out.println("ID     : " + current.getId());
                System.out.println("Name   : " + current.getName());
		System.out.println("Illness: " + current.getIllness());
		System.out.println("Age    : " + current.getAge());
                current = current.getNextPatient();

            } while(current.getId() != 1) ;
        }
        

}
