
public class CodeFlow {

  public static void main(String[] args) {
    CodeFlow testing = new CodeFlow();
	testing.launch(0);
	//testing.launch(2);
	//testing.launch(4);
	//testing.launch(6);
  
  }

public void launch(int userInput) {
  List<Integer> intList = new ArrayList<Integer>();
  intList.add(1);
  intList.add(2);
  intList.add(3);
  intList.add(4);
  intList.add(5);
  intList.add(6);
  try {
    intList.remove(0);
    System.out.println(intList.get(userInput));
    intList.remove(0);
    System.out.println(intList.get(userInput));
    intList.remove(0);
    System.out.println(intList.get(userInput));
    intList.remove(0);
    System.out.println(intList.get(userInput));
    intList.remove(0);
    System.out.println(intList.get(userInput));
    intList.remove(0);
    System.out.println(intList.get(userInput));
    intList.remove(0);
    System.out.println(intList.get(userInput));
  } catch (IndexOutOfBoundsException ex) {
    ex.printStackTrace();
  }
}
}