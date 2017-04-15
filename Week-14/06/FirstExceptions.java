
import java.util.Scanner;

public class FirstExceptions {
  
  //creating exceptions with constructor
  public static class Checked extends Exception {
    public Checked(String s) {
      super(s);
    }
  }
  
  public static class Unchecked extends RuntimeException {
    public Unchecked(String s) {
      super(s);
    }
  }
  
  //creating methods to throw the exceptions
  
  public static void tryCatchChecked() {
	  try {
		  String s = "Checked exception inside try block";
		  throw new Checked(s);
	  } catch (Checked ex){
		  System.out.println(ex);
	  }
  }
  
  public static void tryCatchUnChecked() {
	  try {
		  String s = "Unchecked exception inside try block";
		  throw new Unchecked(s);
	  } catch (Unchecked ex){
		  System.out.println(ex);
	  }
  }
  
  public static void throwChecked() throws Checked {
	  String s = "Checked exception outside try block";
	  throw new Checked(s);
  }
  
  public static void throwUnChecked() {
	  String s = "Unchecked exception outside try block";
	  throw new Unchecked(s);
  }
  
  //implementing created exceptions
  
  public static void main(String[] args) throws Checked {
	  System.out.println("Select an exception to throw");
	  System.out.println("1. Checked within try/catch block");
	  System.out.println("2. Unchecked within try/catch block");
	  System.out.println("3. Checked outside try/catch block");
	  System.out.println("4. Checked outside try/catch block");
	  Scanner in = new Scanner(System.in);
	  int selection = in.nextInt();
      switch (selection) {
          case 1:  tryCatchChecked();
                   break;
          case 2:  tryCatchUnChecked();
                   break;
          case 3:  throwChecked();
                   break;
          case 4:  throwUnChecked();
          		   break;
          default: System.out.println("Not an option");
                   break;
      }
    }
  }

	  
  
