public class TreeIntSetScript {
	public static void main(String [] args) {
		TreeIntSet numbers = new TreeIntSet(5);
		
		numbers.add(25);
		numbers.add(42);
		numbers.add(985);
		numbers.add(4);
		numbers.add(45);
		numbers.add(19);
		numbers.add(83);
	
		numbers.containsVerbose(19);
		numbers.containsVerbose(84);
		numbers.containsVerbose(5);
	}



}
