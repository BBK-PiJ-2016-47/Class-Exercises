public class Person {
	private String name;
	private double shopCost;
	private Person nextPerson;

	public Person(String name, double shopCost) { //constructor
		this.name = name;
		this.shopCost = shopCost;
		this.nextPerson = null;
	}

	public Person getNextPerson() {
		return this.nextPerson;
	}

	public String getName() {
		return this.name;
	}

	public double getShopCost() {
		return this.shopCost;
	}

	public void setNextPerson(Person person) {
		this.nextPerson = person;
	}
}
