public class PersonQueueScript {
	
	public static void main(String[] args) {
		PersonQueueScript script = new PersonQueueScript();
		script.run();
	}
	public void run(){
		System.out.println("Supermarket Queue!");
		Person firstPerson = new Person("Bob", 12.50);
		Person nextPerson = new Person("Jan", 19.0);
		Person anotherPerson = new Person("Ralph", 14.63);
		
		Supermarket mySupermarket = new Supermarket();
		
		printQueue();
	}
	
	public void printQueue() {
		Person person = firstPerson;
		boolean isFirst = true;
		int count = 1; 
		if (person == null) {
			System.out.println("Nothing to print");
			return;
		}
		do{
			if (!isFirst) {
				person = person.getNextPerson();
			}
			System.out.println("Person " + count);
			System.out.println("Name   : " + person.getName());
			System.out.println("Shop cost: " + person.getShopCost());
			count++;
			isFirst = false;
		} while(person.getNextPerson() != null);
	
	
}}
