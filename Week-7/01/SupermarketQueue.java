	public class SupermarketQueue implements PersonQueue {
		private Person lastElementIn = null;
		
		public void insert(Person person) {
			if (lastElementIn == null) {
				lastElementIn = person;
				return;
			}
		
			person.nextPerson = lastElementIn;
			lastElementIn = person;
		}
		
		public Person retrieve() {
			if (lastElementIn == null) {
				System.out.println("There's nobody to serve");
				return null;
			}
			if (lastElementIn.getnextPerson == null) {
				Person result = lastElementIn;
				lastElementIn = null;
				return result;
			}
			while(lastElementIn.getnextPerson.getNextPerson != null) {
				
			}
		
		}
	}
		
