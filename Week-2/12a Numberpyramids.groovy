/*Write a program that outputs a number pyramid like the one below, going on forever (until you press Ctrl-C).
1
22
333
4444
55555
666666
7777777
...
(The formatting of the pyramid will mess up after a few numbers but that is OK for this exercise. If that bothers
you, move on to the second and harder part of this exercise).*/

int num = 1
for (int i=0; i<=num; i++) {
  for (int j=0; j<i; j++) {
    print(num)
  }
  println ""
  num++
} 
