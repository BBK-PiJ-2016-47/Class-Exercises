
package integerbinarytree;


public class Main {

    	public static void main(String [] args) {
		IntegerTreeNode numbers = new IntegerTreeNode(5);

                numbers.add(6);
		numbers.add(9);
		numbers.add(5);
                numbers.add(83);
                numbers.add(18);

	
		numbers.contains(5);
		numbers.contains(25);
		numbers.contains(83);
		numbers.contains(18);
		

		numbers.getMax();
		numbers.getMin();

		System.out.println(numbers.toString());
	}




}
