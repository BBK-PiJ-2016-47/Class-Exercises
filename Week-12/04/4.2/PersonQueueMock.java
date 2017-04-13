
public class PersonQueueMock implements PersonQueue {

	@Override
	public void insert(Person person) {
		//mock method
	}

	@Override
	public Person retrieve() {
		Person morty = new Person("Morty", 19.6);
		return morty;
	}

}
