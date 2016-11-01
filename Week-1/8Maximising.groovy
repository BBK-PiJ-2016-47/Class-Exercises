/*8 Maximising
Write a program that reads a (arbitrarily long) sequence of positive numbers. The sequence is ended when the users
enters “-1”. At that point, the program must output the highest number in the sequence.*/

String s = ""
int bignum = 0
int entry = 0

println "Please enter a number, or enter -1 to finish program: "
s = System.console().readLine()
entry = Integer.parseInt(s)

while (entry != -1) {
println "Please enter a number, or enter -1 to finish program: "
s = System.console().readLine()
entry = Integer.parseInt(s)
  if (entry > bignum) {
  bignum = entry
  }
} 
println "You've terminated the program! The biggest number was: " + bignum
