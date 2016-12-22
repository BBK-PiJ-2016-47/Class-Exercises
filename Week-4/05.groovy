class Point {
	double x;
	double y;

	// calculates the distance to another point
	distanceTo(Point newPoint) {
		double xSum = Math.pow((this.x - newPoint.x), 2)
		double ySum = Math.pow((this.y - newPoint.y), 2)
		double xySum = xSum + ySum
		double root = Math.sqrt(xySum)
		println "The distance is " + root
		}
		
	//calculates the distance to origin 
	distanceToOrigin() {
		Point origin = new Point();
		origin.x = 0
		origin.y = 0
		println "The distance to origin is " + distanceTo(origin)
	}
	
	//changes the coordinates of this point to be the given parameters x and y
	moveTo(double x, double y) {
		this.x = x;
		this.y = y;
		println "The new coordinates are: " + this.x + " and " + this.y
	}
	
	//changes the coordinates of this point to move where the given point is
	moveTo(Point newPoint) {
		this.x = newPoint.x
		this.y = newPoint.y
		println "The new coordinates are: " + this.x + " and " + this.y
	}
	
	//returns a copy of the current point with the same coordinates
	clone() {
		Point copy = new Point();
		copy.x = this.x
		copy.y = this.y
		println "The coordinates of the new point are " + copy.x + " and " + copy.y
	}
	
	//returns a copy of the current point with the coordinates multiplied by −1
	opposite() {
		Point copy = new Point();
		copy.x = (this.x * -1)
		copy.y = (this.y * -1)
		println "The opposite coordinates are " + copy.x + " and " + copy.y
	}
	
}


.


}