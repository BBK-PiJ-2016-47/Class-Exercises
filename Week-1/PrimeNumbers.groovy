/*4 Prime numbers
Write a program that asks a number from the user, then says whether the number is prime or not. Remember that
a prime number is a number that is divisible only by 1 and itself. You can use the modulo operator (if a % b is
zero, then a is divisible by b).*/

int i = 2
print "Please enter a number: "
String s = System.console().readLine()
num = Integer.parseInt(s)

while (i < 10) {
    if (i == num) {
      i++
    } else {
      int a = num % i
    if (a == 0) {
      print "This is not a prime number."
      break;
    } else {
      i++
    }
  }
print "This is a prime number."
break;
}
