public class Supermarket  {
	SupermarketQueue queue = new SupermarketQueue();
	private int queueSize = 0;
	
	public void addPerson(Person person) {
		queue.insert(person);
		System.out.println(person.getName() + " is in the queue now.");
		
	}
	
	public void servePerson() {
		queue.retrieve();
		System.out.println(person.getName() + " has been served. They spent " + person.getShopCost());
	}


	}

