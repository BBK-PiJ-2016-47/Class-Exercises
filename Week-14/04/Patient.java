public class Patient {
	  String name;
	  int birthYear;
	  
	  public Patient(String name, int birthYear) {
	    this.name = name;
		if (birthYear > 1886 && birthYear < 2017) {
		this.birthYear = birthYear;
		} else {
		  throw new IllegalArgumentException();
		}
	  }

	  public static void createNewPatientRecord() {
	    System.out.println("Please enter patient name");
		String pName = System.console().readLine();
		System.out.println("Please enter patient's year of birth");
		String sYear = System.console().readLine();
		int year = Integer.parseInt(sYear);
	    new Patient(pName, year);
	  }

	  public static void main(String[] args) {
		  Patient.createNewPatientRecord();
	  }
	}