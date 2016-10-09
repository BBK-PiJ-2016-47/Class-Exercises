String s = ""
int num1 = 0
int num2 = 0

println "Please key in a number: "
s = System.console().readLine()
num1 = Integer.parseInt(s)

println "Please key in a second number: "
s = System.console().readLine()
num2 = Integer.parseInt(s)

int i = 0
int num3 = 0
while (i < num2) {
  num3 = num3 + num1
  i++
}
println num3
