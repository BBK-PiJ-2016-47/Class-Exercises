MatrixChecker test = new MatrixChecker();
Matrix theMatrix = new Matrix(4,4);

theMatrix.setElement(1,2,96);
theMatrix.setElement(3,2,198);
theMatrix.setElement(2,3,2847);

theMatrix.setRow(0, "45,56,23,65");
theMatrix.setColumn(2, "675,254,859,264");

test.isSymmetrical(theMatrix);
