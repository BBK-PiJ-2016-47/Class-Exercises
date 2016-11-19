	public class SupermarketQueue implements PersonQueue {
		private Person lastPersonIn = null;
		
		public void insert(Person person) {
			if (lastPersonIn == null) {
				lastPersonIn = person;
				return;
			}
		
			person.setNextPerson(lastPersonIn);
			lastPersonIn = person;
		}
		
		public Person retrieve() {
			if (lastPersonIn == null) {
				System.out.println("There's nobody to serve");
				return null;
			}
			if (lastPersonIn.getNextPerson() == null) {
				Person result = lastPersonIn;
				lastPersonIn = null;
				return result;
			}
			Person current = lastPersonIn;
			while(current.getNextPerson().getNextPerson() != null) {
				current.getNextPerson();
			}
			Person next = current.getNextPerson();
			current.setNextPerson(null);
			return next;
		
		}
	}
		
