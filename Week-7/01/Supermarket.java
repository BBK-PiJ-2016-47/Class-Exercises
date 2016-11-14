public class Supermarket  {
	SupermarketQueue queue = new SupermarketQueue();
	private int queueSize = 0;
	
	public void addPerson(Person person) {
		queue.insert(person);
		
	}
	
	public void servePerson() {
		queue.retrieve();
	}


	}

