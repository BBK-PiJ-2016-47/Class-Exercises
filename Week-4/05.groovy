class Point {
	double x;
	double y;
	
	Point(x,y){
	this.x = x
	this.y = y
	}
	// calculates the distance to another point
	double distanceTo(Point newPoint) {
		double xSum = Math.pow((this.x - newPoint.x), 2)
		double ySum = Math.pow((this.y - newPoint.y), 2)
		double xySum = xSum + ySum
		double root = Math.sqrt(xySum)
		return root;
		}
		
	//calculates the distance to origin 
	double distanceToOrigin() {
		Point origin = new Point(0.0,0.0);
		double dist = distanceTo(origin)
		return dist
	}
	
	//changes the coordinates of this point to be the given parameters x and y
	void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
		println "The new coordinates are: " + this.x + " and " + this.y
	}
	
	//changes the coordinates of this point to move where the given point is
	void moveTo(Point newPoint) {
		this.x = newPoint.x
		this.y = newPoint.y
		println "The new coordinates are: " + this.x + " and " + this.y
	}
	
	//returns a copy of the current point with the same coordinates
	Point clone() {
		Point copy = new Point(0,0);
		copy.x = this.x
		copy.y = this.y
		println "The new point is at " + copy.x + " and " + copy.y
		return copy;
	}
	
	//returns a copy of the current point with the coordinates multiplied by -1
	void opposite() {
		Point copy = new Point(0,0);
		copy.x = (this.x * -1)
		copy.y = (this.y * -1)
		println "The opposite coordinates are " + copy.x + " and " + copy.y
	}
	
}

Point test = new Point(4.5, 6.7)
Point diffPoint = new Point(3.0, 8.5)

println "The distance to the new point is " + test.distanceTo(diffPoint);
println "The distance from the origin is " + test.distanceToOrigin();
test.moveTo(8.1,7.0);
test.moveTo(diffPoint);
test.clone();
test.opposite();