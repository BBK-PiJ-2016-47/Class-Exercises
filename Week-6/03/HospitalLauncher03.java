public class HospitalLauncher03 {
	public static void main(String args[]) {
		HospitalLauncher test = new HospitalLauncher();
		test.run();	
	}
	
	public void run() {
	    System.out.println("===Hospital Manager===");
		
		Patient newPatient = new Patient("John",45,"flu");
		addPatient(newPatient);
	}
}
