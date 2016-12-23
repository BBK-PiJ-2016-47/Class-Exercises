public class Teacher {
	private String name;
	
	public Teacher(String name) {
		this.name = name;
	}
	
	public String getName() {
		System.out.println("The lecturer's name is: " + name);
		return name;
	}

	public void teach(String lessonName) {
		System.out.println("Teaching lesson: " + lessonName);
	}
}
