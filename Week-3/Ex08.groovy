/*8 Line to column
Write a program that reads some text from the user and then writes the same text 
on screen, but each letter on a different line.
Now modify your program to write each word (as defined by spaces) rather 
than letter on a different line.
*/

println "Please write some text: "
String input = System.console().readLine()
int leng = input.length()
char[leng] inputArray = input.toCharArray

int i = 0;

while (i<leng) {
println char[i]

}
