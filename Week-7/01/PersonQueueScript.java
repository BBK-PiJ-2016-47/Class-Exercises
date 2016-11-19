public class PersonQueueScript {
		private SupermarketQueue niceQueue = new SupermarketQueue();
		Person firstPerson = new Person("Bob", 12.50);
		Person nextPerson = new Person("Jan", 19.0);
		Person anotherPerson = new Person("Ralph", 14.63);
		private Person head = null;
	
	public static void main(String[] args) {
		PersonQueueScript script = new PersonQueueScript();
		script.run();
	}
	public void run(){
		System.out.println("Supermarket Queue!");
		Supermarket mySupermarket = new Supermarket();
		niceQueue.printQueue();
		
		System.out.println("Adding Bob");
		mySupermarket.addPerson(firstPerson);
		niceQueue.printQueue();
		
		System.out.println("Adding Jan");
		mySupermarket.addPerson(nextPerson);
		niceQueue.printQueue();
		mySupermarket.servePerson();
	}

}

