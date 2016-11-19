/*9 Counting letters
Write a program that reads some text from the user and then says how many letters 
’e’ are there in that text.Then modify the program so that it reads the text from 
the user and then asks for a letter. The program should
then say how many times you can find the letter in the text.
*/

println "Please type in a word: "
String input = System.console().readLine();

int size = input.length();
int counter = 0;
  for(int i = 0; i <  size; i++) {
    if(input.charAt(i) == "c") {
    counter++;
  }
}

print "The character \"c\" appears " + counter + " times."
