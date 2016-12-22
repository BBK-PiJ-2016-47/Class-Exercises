public class HospitalManager03 {
	private Patient head = null; //first patient
	private boolean finished = false;
	private int count = 0;

	
	public void addPatient(Patient newPatient) {
		//if this is the first patient
		if (head == null) {
			head = newPatient;
			System.out.println("Patient has been added.");
			return;
		}
		
		//if not first patient
		Patient current = head;
		while (current.getNextPatient() != null) {
			current = current.getNextPatient();
		}
		current.setNextPatient(newPatient);
		newPatient.setPreviousPatient(current);
		count++;
		System.out.println("Patient has been added.");
	}
	
 
	public boolean deletePatient(String name) {
				if (head == null) {
		// list is empty, nothing to remove
		return false;
			}
		if (head.getName().equals(name)) {
			// first patient in the list must be removed
			head = head.getNextPatient();
			System.out.println("Patient deleted!");
			return true;
			}
		Patient current = head;
		while (current.getNextPatient() != null) {
			if (current.getNextPatient().getName().equals(name)) {
			// We found it! It is the next one!
			// Now link this patient to the one after the next
			current.setNextPatient(current.getNextPatient().getNextPatient());
			
			
			
			
			if (current.getPreviousPatient().getPreviousPatient() != null) {
			current.setPreviousPatient(current.getPreviousPatient().getPreviousPatient());
			}
			System.out.println("Patient deleted!");
			return true;
			}
			current = current.getNextPatient();
			count--;
		}
		System.out.println("Patient not deleted!");
		return false;
		/* Sergio code
		if (head == null) {
		return false;
		}
	
		Patient current = head;
		while(current != null && !current.getName().equals(name)) {
			current = current.getNextPatient();
		}
		if (current == null) {
			return false;
		}
		if (current == head) {
			head = current.getNextPatient();
		}
		if (current.getPreviousPatient() != null) {

				current = current.getPreviousPatient();
		current = current.getNextPatient();
		current = current.getNextPatient();
		}
		if (current.getNextPatient() != null) {
		current = current.getNextPatient();
		current = current.getPreviousPatient();
		current = current.getPreviousPatient();
		}
		return true;*/
	}
	
	public void printPatientList() {
		Patient patient = head;
		if (patient == null) {
			System.out.println("No patients in the hospital!");
			return;
		}
			int counter = 1;
			boolean isFirst = true;
		do{
			if (!isFirst) {
				patient = patient.getNextPatient();
			}
		
			System.out.println("Patient " + counter);
			System.out.println("Name   : " + patient.getName());
			System.out.println("Illness: " + patient.getIllness());
			System.out.println("Age    : " + patient.getAge());
			counter++;
			isFirst = false;
			
		} while(patient.getNextPatient() != null);
	}
	
	public void printPatientListBackwards() {
		Patient patient = head;
		if (patient == null) {
		System.out.println("No patients in the hospital!");
		return;
		}
		
		int counter = 1;
		boolean isFirst = true;

		while(patient.getNextPatient() != null) {
			patient = patient.getNextPatient();
		}
		

		do {
			if (!isFirst) {
			patient = patient.getPreviousPatient();
			}
			
			System.out.println("Patient " + counter);
			System.out.println("Name   : " + patient.getName());
			System.out.println("Illness: " + patient.getIllness());
			System.out.println("Age    : " + patient.getAge());
			counter++;
			isFirst = false;
		} while (patient != null);
	}
	
	public int patientCount() {
		System.out.println("There are " + count + " patients in the hospital.");
		return count;
	}
}
