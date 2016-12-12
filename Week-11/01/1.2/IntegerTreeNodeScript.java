public class IntegerTreeNodeScript {
	public static void main(String [] args) {
		IntegerTreeNode numbers = new IntegerTreeNode(5);
		
		numbers.add(6);
		numbers.add(9);
		numbers.add(5);
	
	/*
		numbers.contains(34);
		numbers.contains(25);
		numbers.contains(83);
		numbers.contains(18);
		*/
		
		numbers.getMax();
		numbers.getMin();
		
		numbers.toString();
	}



}
