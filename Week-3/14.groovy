print "Please enter a word: "
String input = System.console().readLine();

int size = input.length() - 1;
int i = 0;
boolean isPalindrome = true;
	while ((i < size) || (isPalindrome)) {
		if (input[i] == input[size]) {
			i++;
			size--;
		} else {
			isPalindrome = false;
		}
	}
	if (isPalindrome) {
		println input + " is a palindrome!"
	} else {
		println input + " is not a palindrome."
	}

