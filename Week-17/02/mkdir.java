import java.io.File;
import java.util.Scanner;

 public class mkdir {
	 

	
	public void makeDir() {
        System.out.println("Please enter the name of the directory you'd like to make: ");
		Scanner inpt = new Scanner(System.in);
        String name = inpt.nextLine();
		File newFile = new File(name);
		boolean existingFile = newFile.exists();
		if (!existingFile) {
		boolean fileMade = newFile.mkdir();
        System.out.println("The directory was made: " + fileMade);
		} else {
			System.out.println("The directory already exists!");
        }
	}
		
 
   public static void main(String[] args) {
	   mkdir testing = new mkdir();
	   testing.makeDir();
	   
	   
   }
 
 
 }