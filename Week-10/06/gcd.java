public class Gcd {



    public int gcd(int p, int q) {

    //making sure that p is more than q
      if (p < q) {
        int temp = q;
        q = p;
        p = temp;
      }
        if (q == 0) {
            return p;
        } else {
          return gcd(q, (p % q));
        }

    }

    public static void main(String[] args) {
       Gcd test = new Gcd();
       System.out.println(test.gcd(5, 0));
       System.out.println(test.gcd(12, 6));
       System.out.println(test.gcd(12, 15));
       System.out.println(test.gcd(14, 27));

    }
}