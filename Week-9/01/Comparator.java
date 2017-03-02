package dry;

/**
 *
 * @author spencerh
 */

public class Comparator {

public int getMax(int n, int m) {
  double d1 = n;
  double d2 = m;

  return (int) getMax(d1, d2);

}

public double getMax(double d1, double d2) {
    if (d1 > d2) {
        return d1;
    } else {
        return d2;
    }
}

public String getMax(String number1, String number2) {
    int n1 = Integer.parseInt(number1);
    int n2 = Integer.parseInt(number2);
    int max = getMax(n1, n2);
    return String.valueOf(max);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comparator test = new Comparator();
        System.out.println("The biggest number is: ");
        System.out.println("int: " + test.getMax(5, 7));
        System.out.println("String: " + test.getMax("5", "7"));
        System.out.println("Double: " + test.getMax(5.7, 5.2));
    }

}


