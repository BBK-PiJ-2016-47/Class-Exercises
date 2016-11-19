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
		
			
		public void printQueue() {
			Person person = lastPersonIn;
			boolean isFirst = true;
			int count = 1; 
			if (person == null) {
				System.out.println("Nothing to print");
				return;
			}
			do{
				if (!isFirst) {
					lastPersonIn = person.getNextPerson();
				}
				System.out.println("Person " + count);
				System.out.println("Name   : " + person.getName());
				System.out.println("Shop cost: " + person.getShopCost());
				count++;
				isFirst = false;
			} while(person.getNextPerson() != null);
		}
	}
		
