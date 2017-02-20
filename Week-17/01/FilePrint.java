/**
 *Write a program that shows on screen the names of the files in the current directory. (Hint: look at methods from
 *class File).
 */
 import java.io.File;
 
 public class FilePrint {
	 
	 public void printFiles(String filename) {
	 File testDirectory = new File(filename);

	 File[] fileArray = testDirectory.listFiles();
	   for(int i = 0; i < fileArray.length; i++) {
		   System.out.println(fileArray[i]);
	   }
	   
	   if(testDirectory != null) {
		   testDirectory.close();
	   }
	 }
	 public static void main(String[] args) {
		 FilePrint tester = new FilePrint();
		 tester.printFiles("C:\\Users\\hanna\\Documents\\GitHub\\Class-Exercises");
		 
	 }

	 
 }