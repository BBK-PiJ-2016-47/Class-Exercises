Matrix firstTry = new Matrix(4,4);

firstTry.setElement(1,2,96);
firstTry.setElement(3,2,198);
firstTry.setElement(2,3,2847);

firstTry.setRow(0, "45,56,23,65");
firstTry.setColumn(2, "675,254,859,264");

String firstStr = firstTry.toString();
println firstStr;

firstTry.prettyPrint();