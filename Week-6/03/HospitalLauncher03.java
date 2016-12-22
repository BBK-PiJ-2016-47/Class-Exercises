public class HospitalLauncher03 {
	public static void main(String args[]) {
		HospitalLauncher03 test = new HospitalLauncher03();
		test.run();	
	}
	
	public void run() {
	    System.out.println("===Hospital Manager===");
		HospitalManager03 hospital = new HospitalManager03();
		
		Patient newPatient = new Patient("John",45,"flu");
		hospital.addPatient(newPatient);
		newPatient = new Patient("Mary",55,"measles");
		hospital.addPatient(newPatient);
		newPatient = new Patient("Elliot",13,"ill");
		hospital.addPatient(newPatient);
		
		hospital.printPatientList();
	
		
		hospital.deletePatient("Mary");
		hospital.deletePatient("Boris");
		
		hospital.printPatientList();
		hospital.printPatientListBackwards();
	}
}
