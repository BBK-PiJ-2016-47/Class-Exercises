public class Average {
	
  public static void main(String[] args) {
    Average testing = new Average();
    testing.getAverage();	
  }
	
  public int getAverage() {
  int [] avgArr = new int[10];
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