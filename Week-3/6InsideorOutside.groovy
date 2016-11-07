/*6 Inside or outside
Write a program that reads the coordinates of the two points defining a rectangle 
and then the coordinates of a third point. The program must then determine whether 
the point falls inside or outside the rectangle.*/

class Point {
double x;
double y;
}

class Rectangle {
Point upLeft;
Point downRight;
}


Rectangle myRectangle = new Rectangle();
myRectangle.upLeft = new Point();
myRectangle.downRight = new Point();
Point thirdPoint = new Point()


print "Please enter the upper left's x coordinate: "
String s = System.console().readLine()
myRectangle.upLeft.x = Double.parseDouble(s)


print "Please enter the upper left's y coordinate: "
s = System.console().readLine()
myRectangle.upLeft.y = Double.parseDouble(s)

print "Please enter the lower right's x coordinate: "
s = System.console().readLine()
myRectangle.downRight.x = Double.parseDouble(s)

print "Please enter the lower right's y coordinate: "
s = System.console().readLine()
myRectangle.downRight.y = Double.parseDouble(s)

print "Please enter the third x coordinate: "
s = System.console().readLine()
thirdPoint.x = Double.parseDouble(s)

print "Please enter the third y coordinate: "
s = System.console().readLine()
thirdPoint.y = Double.parseDouble(s)

if ((thirdPoint.x < myRectangle.upLeft.x) || (thirdPoint.x > myRectangle.downRight.x)) {
  print "these coordinates are outside the rectangle"
} else if ((thirdPoint.y > myRectangle.upLeft.y) || (thirdPoint.y < myRectangle.downRight.y)) {
  print "these coordinates are outside the rectangle"
} else {
  print "these coordinates are inside the rectangle"
}
