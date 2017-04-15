public class ImprovedAverage {
	
  public static void main(String[] args) {
    ImprovedAverage testing = new ImprovedAverage();
    testing.getAverage();	
  }
  int [] avgArr;
  int total = 0;
  int size = 0;
  
  private int getInput(int i) {
	  System.out.println("Please enter a number: ");
        String sNum = System.console().readLine();
        int num = Integer.parseInt(sNum);
        avgArr[i] = num;
        total += num;
		return total;
  }
  
  public int getAverage() {
  System.out.println("How many numbers would you like to average?");
  String sSize = System.console().readLine();
  try {
  size = Integer.parseInt(sSize);
  avgArr = new int[size];
  } catch (NumberFormatException ex){
	  System.out.println("That's not a number! Please restart.");
	  return 0;
  }

    try {
      for(int i = 0; i < size; i++) {
        getInput(i);
      }
    } catch (NumberFormatException ex) {
      System.out.println("That wasn't a number, please try again!");
	  int i = 0;
	  while( i < size) {
        if (avgArr[i] == 0) {
	      getInput(i);
		  i++;
		} else {
			i++;
		}
	  }
    }
    int result = (total / size);
    System.out.println("The average is: " + result);
    return result;
  }
}