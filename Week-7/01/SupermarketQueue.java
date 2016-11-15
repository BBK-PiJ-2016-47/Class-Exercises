	public class SupermarketQueue implements PersonQueue {
		private Person lastPersonIn = null;
		
		public void insert(Person person) {
			if (lastPersonIn == null) {
				lastPersonIn = person;
				return;
			}
		
			person.nextPerson = lastPersonIn;
			lastPersonIn = person;
		}
		
		public Person retrieve() {
			if (lastPersonIn == null) {
				System.out.println("There's nobody to serve");
				return null;
			}
			if (lastPersonIn.getnextPerson == null) {
				Person result = lastPersonIn;
				lastPersonIn = null;
				return result;
			}
			while(lastPersonIn.getnextPerson.getNextPerson != null) {
				person.setNextPerson(person.getNextPerson.getNextPerson);
			}
		
		}
	}
		
