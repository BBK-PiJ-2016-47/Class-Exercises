public class HospitalManager {
 // this is a member method of class HospitalManager
 // returns true if the patient was found and removed, false otherwise
	private Patient head = null;
	private boolean finished = false;
	private int numPatients = 0;
	private int count = 0;

	public void run() {
	    System.out.println("===Hospital Manager===");
		while (!finished) {
			addPatient(readPatient());
		}
		finished = false;
		while (!finished) {
			System.out.println("Now select an option");
			System.out.println("1. Print list");
			System.out.println("2. Delete Patient {name}");
			System.out.println("3. Print number of patients");
			System.out.println("4. Exit");	
			System.out.print(">> ");
			int choice = Integer.parseInt(System.console().readLine());
			switch (choice) {
				case 1:
					printPatientList();	
					break;
				case 2:
					System.out.print("Enter the name of patient to delete >> ");
					String patientY = System.console().readLine();
					if (!deletePatient(patientY)) {
						System.out.println("No patient found (" + patientY + ")");	
					} else {
						System.out.println("Patient " + patientY + " deleted!");	
					}
					break;
				case 3:
					patientCount();
					break;
				case 4:
					finished = true;
					break;
				default:
					System.out.println("Invalid option, please select from 1-4");
			}
		}
		System.out.print("Thanks, bye!");
	}
	// this is a member method of class HospitalManager
	public void addPatient(Patient newPatient) {
		if (head == null) {
			head = newPatient;
			return;
		}
		Patient current = this.head;
		while (current.getNextPatient() != null) {
		// this means we are not yet at the end of the list
		current = current.getNextPatient();
		}
		// at this point, current points to the last patient
		current.setNextPatient(newPatient);
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
			return true;
			}
			current = current.getNextPatient();
			count--;
		}
		return false;
	}

	public Patient readPatient(){
		System.out.println("Enter details for Patient " + (numPatients+1));
		System.out.print("Name    >> ");
		String name = System.console().readLine();
		if (name.length() == 0) {
			finished = true;
			return null;
		}
		System.out.print("Illness >> ");
		String illness = System.console().readLine();
		System.out.print("Age     >> ");
		int age = Integer.parseInt(System.console().readLine());
		Patient patientX = new Patient(name, age, illness);
		numPatients++;
		return patientX;
	}
	
	public void printPatientList() {
		Patient patient = head;
		boolean isFirst = true;
		if (patient == null) {
			System.out.println("Nothing to print");
			return;
		}
			int counter = 1;
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
	
	public int patientCount() {
		System.out.println("There are " + count + " patients in the hospital.");
		return count;
	}
}
