public class IntegerTreeNodeScript {
	public static void main(String [] args) {
		IntegerTreeNode numbers = new IntegerTreeNode(5);
		
		numbers.add(25);
		numbers.add(42);
		numbers.add(985);
		numbers.add(4);
		numbers.add(45);
		numbers.add(19);
		numbers.add(83);
	
		numbers.contains(34);
		numbers.contains(25);
		numbers.contains(83);
		numbers.contains(18);
		
		numbers.getMax();
		numbers.getMin();
	}



}
