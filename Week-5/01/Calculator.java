/* Create a Java class called Calculator. The class should implement the following methods, each of them printing
the result on the screen.
• add(int, int)
• subtract(int, int)
• multiply(int, int)
• divide(int, int)
• modulus(int, int)
Note that you will will need to cast the parameters into double to perform exact division.
Write a small Groovy or Java Decaf program that uses all the methods of Calculator.
*/

public class Calculator {
  private int x;
  private int y;
  
  public Calculator(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public int getX() {
    return x;
  }
  public int getY() {
    return y;
  }
  public int add(int x, int y) {
  int addResult = (x + y);
  System.out.println(x + " plus " + y + " equals " + addResult);  
  return addResult;
  }

  public int subtract(int x, int y) {
  int subtractResult = (this.x - this.y);
  System.out.println(x + " minus " + y + " equals " + subtractResult);
  return subtractResult;
  }

  public int multiply(int x, int y) {
  int multiplyResult = (this.x * this.y);
  System.out.println(x + " times " + y + " equals " + multiplyResult);
  return multiplyResult;
  }

  public double divide(int x, int y) {
  double n = (double) this.x;
  double q = (double) this.y;
  double divideResult = (n / q);
  System.out.println(x + " divided " + y + " equals " + divideResult);
  return divideResult;
  }

}
