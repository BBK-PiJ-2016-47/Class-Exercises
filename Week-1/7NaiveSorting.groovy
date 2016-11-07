/*7 Naive sorting
Write a program that reads three numbers and prints them in order, from lowest to highest.
*/

print "Please enter a number: "
String s = System.console().readLine()
num1 = Integer.parseInt(s)
print "Please enter another number: "
String s = System.console().readLine()
num2 = Integer.parseInt(s)
print "Please enter a final number: "
String s = System.console().readLine()
num3 = Integer.parseInt(s)

if (num1 < num2) {
  if (num2 < num3) {
  println num1 + ", " + num2 + ", " + num3
  } else if (num3 < num2) {
    if (num3 < num1) {
    println num3 + ", " + num1 + ", " + num2
    } else {
    println num1 + ", " + num3 + ", " + num2
    }
  }

} else {
  if (num3 < num2) {
    println num3 + ", " + num2 + ", " + num1
  } else {
    if (num3 < num1) {
      println num2 + ", " + num1 + ", " + num3
    } else {
      println num2 + ", " + num3 + ", " + num1
    }
  }
}
