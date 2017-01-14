/*
Text2number
Write a program that reads a number with commas and decimal dots (such as 
“23,419.34”) and then prints a number that is half of it. Do not use 
Double.parseDouble(). If you were writing a simple spreadsheet, 
you could use this code to parse the input in the cells.


*/

print "Please enter a number: "
String num = System.console().readLine();

num = num.replace(",","");
int size = num.length();
String wholeNum = "";
boolean dec = false;

for(int i = 0; i < size; i++) {
	if (num.charAt(i) == ".") {
		dec = true;
	} else {
		wholeNum = wholeNum + num.charAt(i);
	}
}

int wholeNumInt = Integer.parseInt(wholeNum);
wholeNumInt = (wholeNumInt / 2);

wholeNum = "" + wholeNumInt;


if (dec) {
	wholeNum = wholeNum.replace(".","");
	wholeNum = wholeNum.substring(0, (wholeNum.length() - 2)) + "." + wholeNum.substring(wholeNum.length()-2);
}

print "Half of " + num + " is " + wholeNum;
