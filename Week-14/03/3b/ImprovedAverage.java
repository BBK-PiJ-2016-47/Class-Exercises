public class ImprovedAverage {
	
  public static void main(String[] args) {
    ImprovedAverage testing = new ImprovedAverage();
    testing.getAverage();	
  }
  int [] avgArr;
  public int getAverage() {
  System.out.println("How many numbers would you like to average?");
  String sSize = System.console().readLine();
  try {
  int Size = Integer.parseInt(sSize);
  avgArr = new int[Size];
  } catch (NumberFormatException ex){
	  System.out.println("That's not a number! Please restart.");
	  return 0;
  }
  

  int total = 0;
    try {
      for(int i = 0; i < 10; i++) {
        System.out.println("Please enter a number: ");
        String sNum = System.console().readLine();
        int num = Integer.parseInt(sNum);
        avgArr[i] = num;
        total += num;
      }
    } catch (NumberFormatException ex) {
      System.out.println("That wasn't a number, please try again!");
	  int i = 0;
	  while( i < 10) {
        if (avgArr[i] == 0) {
	      System.out.println("Please enter a number: ");
          String sNum = System.console().readLine();
          int num = Integer.parseInt(sNum);
          avgArr[i] = num;
          total += num;
		  i++;
		} else {
			i++;
		}
	  }
    }
    int result = (total / 10);
    System.out.println("The average is: " + result);
    return result;
  }
}