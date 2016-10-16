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
