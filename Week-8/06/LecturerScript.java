public class LecturerScript {
	public static void main(String[] args) {
		LecturerScript test = new LecturerScript();
		test.run();
	}
	
	public void run() {
	
	Lecturer lecturer = new Lecturer("Dr.X");
	lecturer.getName();
	lecturer.teach("PiJ");
	lecturer.doResearch("AI");
	
	}

}