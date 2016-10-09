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
