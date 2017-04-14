
package doublylinkedlist;

/**
 *
 * @author spencerh
 */
public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient prevPatient;

	public Patient(String name, int age, String illness) {   //constructor
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null; // Pointer to another patient!
		this.prevPatient = null;
	}

	public Patient getNextPatient(){
		return this.nextPatient;
	}

	public Patient getPreviousPatient() {
		return this.prevPatient;
	}

	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String getIllness(){
		return this.illness;
	}
	public void setNextPatient(Patient patient){
		this.nextPatient = patient;
	}
	public void setPreviousPatient(Patient patient) {
		this.prevPatient = patient;
	}
}