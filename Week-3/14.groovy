/*Palindrome creator
Write a program that reads a text and then writes on the screen a palindrome by writing the same text followed
by the same text in reversed order. For example, if the user enters the text “It was a dark and stormy night” the
program must output “It was a dark and stormy nightthgin ymrots dna krad a saw tI”.*/

print "Please enter a word: "
String input = System.console().readLine();

int size = input.length();
int i = 0;
boolean isPalindrome = true;
String palindrome = input;
	while (i < size) {
		palindrome = palindrome + input.charAt(size-1);
		size--;
	}
	
println palindrome;

