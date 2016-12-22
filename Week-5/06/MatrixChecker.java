public class MatrixChecker {
	
	public boolean isSymmetrical(int[] anArray) {
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

	
	public boolean isSymmetrical(int[][] aMatrix) {
		int rows = aMatrix.length;
		int cols = aMatrix[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (aMatrix[i][j] != aMatrix[j][i]) {
					System.out.println("Matrix is not symmetrical!");
					return false;
				}
			}

		}
	System.out.println("Matrix is symmetrical!");
	return true;			
}
	
	public boolean isTriangular(int[][] aMatrix) {
		return true;
	
	}


}