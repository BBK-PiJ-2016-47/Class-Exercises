/* Palindrome
A palindrome is a word, phrase, number, or other sequence of units that may be read the same way in either
direction. Examples of strict palindromes include “ABBA”, “madam”, “radar”, “kayak”, and “step on no pets”.
Write a program that reads a text and detects whether the text is a strict palindrome.
*/

print "Please enter a word: "
String input = System.console().readLine();

int size = input.length() - 1;
int i = 0;
boolean isPalindrome = true;
	while (i < size) {
		if (input.charAt(i) == input.charAt(size)) {
			i++;
			size--;
		} else {
			isPalindrome = false;
			break;
		}
	}
	if (isPalindrome) {
		println input + " is a palindrome!"
	} else {
		println input + " is not a palindrome."
	}

