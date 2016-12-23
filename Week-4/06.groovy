public class Integer2 {
	int value
	
	int getValue() {
	println "Value is: " + value
	return value;
	}
	
	void setValue(int val) {
		this.value = val
	}
	
	boolean isEven() {
		return (value % 2 == 0) ? true : false;
	
	}
	
	boolean isOdd() {
		return (value % 2 == 0) ? false : true;
	}
	
	void prettyPrint() {
		println "The value is: " + value;
	}
	
	String toString() {
		String strValue = "" + value
		return strValue
	}
	

}

Integer2 i2 = new Integer2();
print "Enter a number: ";
String str = System.console().readLine();
int i = Integer.parseInt(str);
i2.setValue(i);
print "The number you entered is "
if (i2.isEven()) {
println "even.";
} else if (i2.isOdd()) {
println "odd.";
} else {
println "undefined!! Your code is buggy!";
}
int parsedInt = Integer.parseInt(i2.toString());
if (parsedInt == i2.getValue()) {
println("Your toString() method seems to work fine.");
}