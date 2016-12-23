class Point {
	double x;
	double y;
}

class Rectangle {
	Point upLeft;
	Point downRight;
}

Rectangle firstRectangle = new Rectangle();
firstRectangle.upLeft = new Point();
firstRectangle.downRight = new Point();
boolean inFirstRec = true;
boolean inSecRec = true;

Rectangle secondRectangle = new Rectangle();
secondRectangle.upLeft = new Point();
secondRectangle.downRight = new Point();

firstRectangle.upLeft.x = 1.0;
firstRectangle.upLeft.y = 3.0;
firstRectangle.downRight.x = 3.0;
firstRectangle.downRight.y = 2.0;

secondRectangle.upLeft.x = 2.0;
secondRectangle.upLeft.y = 4.0;
secondRectangle.downRight.x = 3.0;
secondRectangle.downRight.y = 2.0;

Point testPoint = new Point();

print "Please enter the x coordinate: "
String s = System.console().readLine()
testPoint.x = Double.parseDouble(s)


print "Please enter the y coordinate: "
s = System.console().readLine()
testPoint.y = Double.parseDouble(s)


if ((testPoint.x < firstRectangle.upLeft.x) || (testPoint.x > firstRectangle.downRight.x)) {
	inFirstRec = false;
} else if ((testPoint.y > firstRectangle.upLeft.y) || (testPoint.y < firstRectangle.downRight.y)) {
	inFirstRec = false;
} else {
	inFirstRec = true;
}

if ((testPoint.x < secondRectangle.upLeft.x) || (testPoint.x > secondRectangle.downRight.x)) {
	inSecRec = false;
} else if ((testPoint.y > secondRectangle.upLeft.y) || (testPoint.y < secondRectangle.downRight.y)) {
	inSecRec = false;
} else {
	inSecRec = true;
}

if (inFirstRec && inSecRec) {
	print "The point is in both rectangles.";
} else if (inFirstRec || inSecRec) {
	print "The point is in only one rectangle.";
} else {
		print "The point is in neither rectangle.";
}