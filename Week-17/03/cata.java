import java.io.File;
import java.util.Scanner;

public class cata {

	
	public void listDir() {
        System.out.println("Please enter the name of the directory you'd like to show: ");
		Scanner inpt = new Scanner(System.in);
        String name = inpt.nextLine();
		File newFile = new File(name);
		boolean existingFile = newFile.exists();
		if (!existingFile) {
        System.out.println("The directory does not exist!");
		} else {
			File[] fileArray = newFile.listFiles();
			for(int i = 0; i < fileArray.length; i++) {
				System.out.println(fileArray[i]);
			}
        }
	}
		
 
   public static void main(String[] args) {
	   cata testing = new cata();
	   testing.listDir();
	   
	   
   }
 
 

}