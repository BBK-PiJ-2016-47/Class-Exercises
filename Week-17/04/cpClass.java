/**
Write a program that takes two names from the user at the command line. If a file with the first name exists, the
program must copy it into a file with the second name.
If the first file does not exist, the program must say so. If the second file does exists, the program must ask the
user whether to overwrite it or not, and act accordingly.
*/

import java.io.File;
import java.util.Scanner;

public class cpClass {
	
	public void moveDir() {
        System.out.println("Please enter the name of the directory you'd like to be copied: ");
		Scanner inpt = new Scanner(System.in);
        String first = inpt.nextLine();
		System.out.println("Please enter the name of the directory you'd like to copy into: ");
		inpt = new Scanner(System.in);
        String second = inpt.nextLine();
		
		
		File firstFile = new File(first);
		File secondFile = new File(second);
		if(!firstFile.exists()) {
			System.out.println("The file " + first + " does not exist!");
		}
		
		boolean writeFile = true;
		if(secondFile.exists()) {
			System.out.println("This file already exists. Overwrite? Y/N");
			inpt = new Scanner(System.in);
			String choice = inpt.nextLine();
			if (choice.equals("N")) {
				writeFile = false;
			}
        }
		
		if(writeFile) {
			System.out.println(secondFile.mkdir());
			firstFile.copy(firstFile, secondFile, REPLACE_EXISTING);
			
		} else {
			System.out.println("You have chosen to not overwrite the existing directory.");
		}
		
		
	}
		
 
   public static void main(String[] args) {
	   cpClass testing = new cpClass();
	   testing.moveDir();
	   
	   
   }


}