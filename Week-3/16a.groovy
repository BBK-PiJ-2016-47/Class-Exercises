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
int decDot = 0;
int i = 0;
String wholeNum = "";

while(i < size){
  if (num.charAt(i) == ".") {
    decDot = i;
  }
  i++;
}

String sWhole = num.substring(0,decDot);
int whole = Integer.parseInt(sWhole);
whole = whole/2;

String sDecimal = num.substring(decDot + 1,size-1);
int decimal = Integer.parseInt(sDecimal);

if (whole % 2 != 0) {
  if (decimal < 10) {
    decimal = decimal + 1;
  } else {
    decimal = decimal + 10;
  }
}

decimal = decimal / 2;

String result = whole + "." + decimal;
System.out.println("The answer is: " + result);
return result;