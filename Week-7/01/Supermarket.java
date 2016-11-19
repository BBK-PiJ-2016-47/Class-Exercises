public class Supermarket  {
	SupermarketQueue queue = new SupermarketQueue();
	private int queueSize = 0;
	private Person head = null;

	
	public static void main(String[] args) {
		Person firstPerson = new Person("Bob", 12.50);
		Person nextPerson = new Person("Jan", 19.0);
		Person anotherPerson = new Person("Ralph", 14.63);
		
		
		System.out.println("Supermarket Queue!");
		Supermarket mySupermarket = new Supermarket();
		
		System.out.println("Adding Bob");
		mySupermarket.addPerson(firstPerson);
		
		System.out.println("Adding Jan");
		mySupermarket.addPerson(nextPerson);
		mySupermarket.getQueueSize();
		
		mySupermarket.servePerson();
		mySupermarket.getQueueSize();

	}
	
	public void addPerson(Person person) {
		queue.insert(person);
		System.out.println(person.getName() + " is in the queue now.");
		queueSize++;
		
	}
	
	public void servePerson() {
		Person served = queue.retrieve();
		System.out.println(served.getName() + " has been served. They spent " + served.getShopCost());
		queueSize--;
	}
	public void getQueueSize() {
		
		System.out.println("There are " + queueSize + " people in the queue.");
	}

	}

