public class IntegerTreeNode {
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;
	
	public IntegerTreeNode(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}
	
	public boolean contains(int n) {
		if (n == this.value) {
			System.out.println("The tree does contain " + n);
			return true;
		} else if (n > this.value) {
			if (right == null) {
				System.out.println("The tree does not contain " + n);
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				System.out.println("The tree does not contain " + n);
				return false;
			} else {
				return left.contains(n);
			}
		}
	}
	
	public int getMax() {
		if (right == null) {
			int max = this.value;
			System.out.println("The max value is " + max);
			return max;
		} else {
			return right.getMax();
		}
		
		
	}
	
		public int getMin() {
		if (left == null) {
			int min = this.value;
			System.out.println("The min value is " + min);
			return min;
		} else {
			return left.getMin();
		}
		
		
	}
	
	
	public String toString() {
		int element = this.value;
		String print = "" + element;
		System.out.print("[" + print);
		
		if (left == null) {
			System.out.print("L[]");
		} else {
			return this.left.toString();
		}
		
		if (right == null) {
			System.out.print("R[]");
		} else {
			return this.right.toString();
		}
		
		return print;
	
	
		
	}
}
