public class MatrixChecker {
	public boolean isSymmetrical(int[]) {
		int leng = anArray.length;
		for (int i = 0; i < leng / 2; i++) {
			if (anArray[i] != anArray[leng- i - 1]) {
				System.out.println("Array is not symmetrical!");
				return false;
				}
		}
		System.out.println("Array is symmetrical!");
		return true;
	}

	
	public boolean isSymmetrical(int[][]) {
	
	}
	
	public booleann isTriangular(int[][]) {
	
	
	}


}