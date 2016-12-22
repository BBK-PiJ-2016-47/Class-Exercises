MatrixMade matrix = new MatrixMade()

int[][] nonSymmetricalMatrix = matrix.nonSymmetricalMatrix
int[][] SymmetricalMatrix = matrix.SymmetricalMatrix
int[][] TriangularMatrix = matrix.TriangularMatrix

MatrixChecker test = new MatrixChecker()
test.isSymmetrical(nonSymmetricalMatrix);
test.isSymmetrical(SymmetricalMatrix);

test.isTriangular(TriangularMatrix);
test.isTriangular(nonSymmetricalMatrix);
