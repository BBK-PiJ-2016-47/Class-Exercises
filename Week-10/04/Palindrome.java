public class Palindrome {
/*
Create a program with a (recursive) method that takes a String paremeter and returns true if the String is a
palindrome and false otherwise. Compare this recursive version with the iterative version you wrote in past weeks.
Which one seems clearer to you?

*/
	public static boolean isPalindrome(String str) {
		boolean boo = true;
		if ((str.length() == 0) || str.length() == 1) {
			boo = true;
		} else {
			if (str.charAt(0) == str.charAt(str.length() -1)) {
				isPalindrome(str.substring(1,str.length()-1));
			} else {
				boo = false;
			}
			
		}
		return boo;
	}
	

	
	public static void main(String [] args) {
		isPalindrome("abba");
		isPalindrome("fhsom");
		isPalindrome("petstep");
		isPalindrome("pegstep");
		
	}


}
