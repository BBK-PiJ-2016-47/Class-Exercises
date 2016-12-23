class Point {
	double x;
	double y;
}
print "Please enter the first point's x coordinate: "
s = System.console().readLine()
Point point1 = new Point();
point1.x = Double.parseDouble(s)

print "Please enter the first point's y coordinate: "
s = System.console().readLine()
point1.y = Double.parseDouble(s)

print "Please enter the second point's x coordinate: "
s = System.console().readLine()
Point point2 = new Point();
point2.x = Double.parseDouble(s)

print "Please enter the second point's y coordinate: "
s = System.console().readLine()
point2.y = Double.parseDouble(s)


print "Please enter the third point's x coordinate: "
s = System.console().readLine()
Point point3 = new Point();
point3.x = Double.parseDouble(s)

print "Please enter the third point's y coordinate: "
s = System.console().readLine()
point3.y = Double.parseDouble(s)


//distance between 1 & 2

double xminus = (point1.x - point2.x)
double xminussqr = xminus**2

double yminus = (point1.y - point2.y)
double yminussqr = yminus**2

double sum = (xminussqr + yminussqr)
double distance12 = Math.sqrt(sum)

//distance between 1 & 3

xminus = (point1.x - point3.x)
xminussqr = xminus**2

yminus = (point1.y - point3.y)
yminussqr = yminus**2

sum = (xminussqr + yminussqr)
double distance13 = Math.sqrt(sum)

//distance between 2 & 3

xminus = (point2.x - point3.x)
xminussqr = xminus**2

yminus = (point2.y - point3.y)
yminussqr = yminus**2

sum = (xminussqr + yminussqr)
double distance23 = Math.sqrt(sum)

//finding which distance is bigger

if (distance12 < distance13) {
  if (distance12 < distance23) {
    println "Point one and point two are the closest together."
  } else {
    println "Point two and point three are the closest together."
  } 
}else {
  if (distance13 < distance23) {
    println "Point one and point three are the closest together."
  }
}
