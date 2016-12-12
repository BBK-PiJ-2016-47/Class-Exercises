public class TreeIntSet implements IntSet {
	int value;
	TreeIntSet left;
	TreeIntSet right;
	
	public TreeIntSet(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new TreeIntSet(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new TreeIntSet(newNumber);
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
	
	public boolean containsVerbose(int n) {
		System.out.println("Number checked: " + this.value);
		if (n == this.value) {
			System.out.println("Number checked: " + this.value);
			System.out.println("The tree does contain " + n);
			return true;
		} else if (n > this.value) {
			if (right == null) {
				System.out.println("The tree does not contain " + n);
				return false;
			} else {
				System.out.println("Number checked: " + right.value);
				return right.contains(n);
			}
		} else {
			if (left == null) {
				System.out.println("The tree does not contain " + n);
				return false;
			} else {
				System.out.println("Number checked: " + left.value);
				return left.contains(n);
			}
		}
		
		
		
	}

}
