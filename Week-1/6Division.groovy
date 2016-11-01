/*6 Division
Write a program that requests two numbers from the user and then outputs the quotient and the remainder, e.g. if
the user enters 7 and 3, your program should ouput something like “7 divided by 3 is 2, remainder 1”. You cannot
use the “/” or “%” operators.
*/

String s=""
int num1 = 0
int num2 = 0

println "Please type in a number: "
s = System.console().readLine()
num1 = Integer.parseInt(s)

println "Please type in another number: "
s = System.console().readLine()
num2 = Integer.parseInt(s)

int i = 0
int num3 = 0

while (num3 < num1) {
  num3 = num3 + num2
  i++
}
println num1 + " divided by " + num2 + " equals " + i
