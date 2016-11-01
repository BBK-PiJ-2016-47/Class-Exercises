/*Write a program that reads a number between 1 and 25, and then outputs a number pyramid like the one below
(the example is for number 8) with that number of levels. Notice that you must write the right number of spaces
at each level so that the pyramid is properly aligned to the right.
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7
8 8 8 8 8 8 8 8*/

print "Please enter a number: "
String inpt = System.console().readLine()
int num = Integer.parseInt(inpt)
int x = 0

while (x < num) {
  for (int i=0; i<=num; i++) {
    print " " * (num-i)
    if (i < 10) {
      print " " * (num+1-i) 
    } else {
      print " " * (num-i)
    }
    for (int j=0; j<i; j++) {
      if (i < 10) {
        print i + " "
      } else {
        print i
      }
    }
  println ""
  x++
} 
