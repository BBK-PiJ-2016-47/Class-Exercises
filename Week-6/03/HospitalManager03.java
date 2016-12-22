public class HospitalManager03 {
	private Patient head = null; //first patient
	private Patient tail = null;
	private boolean finished = false;
	private int count = 0;

	
	public void addPatient(Patient newPatient) {
		//if this is the first patient
		if (head == null) {
			head = newPatient;
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
	}
	
 
	public boolean deletePatient(String name) {
		if (head == null) {
		// list is empty, nothing to remove
		return false;
			}
		if (head.getName().equals(name)) {
			// first patient in the list must be removed
			head = head.getNextPatient();
			return true;
			}
		Patient current = head;
		while (current.getNextPatient() != null) {
			if (current.getNextPatient().getName().equals(name)) {
			// We found it! It is the next one!
			// Now link this patient to the one after the next
			current.setNextPatient(current.getNextPatient().getNextPatient());
			System.out.println("The patient has been deleted.");
			return true;
			}
			current = current.getNextPatient();
			count--;
		}
		System.out.println("No patient of that name to delete");
		return false;
	}
	
	public void printPatientList() {
		if (patient == null) {
			System.out.println("No patients in the hospital!");
			return;
		}
			int counter = 1;
			Patient patient = head;
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
		
	}
	
	public int patientCount() {
		System.out.println("There are " + count + " patients in the hospital.");
		return count;
	}
}
