/*2 Calculator
Write a program that reads two numbers from the user and then offers a menu with the four basic operations:
addition, subtraction, multiplication, and division. Once the user has selected an operation from the menu, the
calculator performs the operation.
*/

println "Please enter your first number: "
String inpt = System.console().readLine()
double num1 = Double.parseDouble(inpt)
println "Please enter your second number: "
inpt = System.console().readLine()
double num2 = Double.parseDouble(inpt)

println "please state what you would like to do: "
println "Press 1 to add " + num1 + " and " + num2
println "Press 2 to subtract " + num1 + " from " + num2
println "Press 3 to subtract " + num2 + " from " + num1
println "Press 4 to multiply " + num1 + " and " + num2
println "Press 5 to divide " + num1 + " by " + num2
println "Press 6 to divide " + num2 + " by " + num1

String s = System.console().readLine()
Integer choice = Integer.parseInt(s)
switch (choice) {
  case 1:
    double add = (num1 + num2)
    print num1 + " + " + num2 + " = " + add
    break;
  case 2:
    double subtract = (num2-num1)
    print num2 + " - " + num1 + " = " + subtract
    break;
  case 3:
    double subtract = (num1-num2)
    print num1 + " - " + num2 + " = " + subtract
    break;
  case 4:
    double multiply = (num1*num2)
    print num1 + " x " + num2 + " = " + multiply
    break;
  case 5:
    double divide = (num1 / num2)
    print num1 + " / " + num2 + " = " + divide
    break;
  case 6:
    double divide = (num2 / num1)
    print num2 + " / " + num1 + " = " + divide
    break;
  default:
    print "Option not valid, please enter an option from 1-6"
    break;
}
