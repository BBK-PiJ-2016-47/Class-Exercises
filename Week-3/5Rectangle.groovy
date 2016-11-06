/*
Write a program that reads the X and Y coordinates of two points and then outputs the area of a rectangle where
both points are opposite corners. Use the following class to store the data for the points:
class Rectangle {
Point upLeft;
Point downRight;
}
Your program should calculate (and write on the screen) the perimeter and area of the rectangle.
Note: For exercises 5, 6, and 7 you must access (i.e. read or write) the value of the coordinates of the points
through the rectangle, not directly through the point, i.e. myRectangle.upLeft.x, not point.x or x
*/

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

print "Please enter the upper left's x coordinate: "
s = System.console().readLine()
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

double width = (myRectangle.downRight.x - myRectangle.upLeft.x);
double length = (myRectangle.upLeft.y - myRectangle.downRight.y);

double area = width * length;
println "The area is " + area;
