public class Grades {
private int mark = 0;
private String sMark = "";
private int distinctions = 0;
private int passes = 0;
private int fails = 0;
private int invalid = 0;

public void checkMark() {

do {
		System.out.println("Please input a mark: ");
		sMark = System.console().readLine();
		mark = Integer.parseInt(sMark);
		if (mark >= 70 && mark <= 100) {
			distinctions++;
		} else if (mark <= 69 && mark >= 50) {
			passes++;
		} else if (mark <= 49 && mark >= 0) {
			fails++;
		} else {
			invalid++;
		}
	} while (mark != -1);
	
		
	System.out.println("There were " + distinctions + " distinctions, " + passes + " passes, and " +
	fails + " fails (plus " + invalid + " invalid entries.)");
}

public static void main(String[] args) {
	Grades PiJ = new Grades();
	PiJ.checkMark();

	
	}
}