		public class SupermarketQueue implements PersonQueue {
		private Person firstPerson = null
		
		public void insert(Person person) {
		if (firstPerson == null) {
			firstPerson = person;
			return;
		}
		
		person.nextPerson = firstPerson;
		firstPerson = person;
		}
		/*
	Person current = this.firstPerson;
		while (current.getNextPerson() != null) {
		current = current.getNextPerson();
		}
		current.setNextPerson(person);
		}
		*/
		public Person retrieve() {
		if (firstPerson == null) {
			System.out.println("There is nobody in the queue to serve!");
		}
			firstPerson = firstPerson.getNextPerson();
			return firstPerson;
		}
		}
	
