/**
 * Created by hanna on 13/05/2017.
 */


public class Ex03 {

    public static void main(String[] args) {
      String a = "pineapple";
      String b = "sponge";

      System.out.println("Test which is longer: ");
      System.out.println(betterString(a, b, (s1,s2) -> s1.length() > s2.length()));

      System.out.println("Always return the first one: ");
      System.out.println(betterString(a, b, (s1,s2) -> true));
    }

    public static String betterString(String a, String b, TwoStringPredicate c) {
      return (c.isBetter(a,b) ? a : b);
    }
}


interface TwoStringPredicate {
    boolean isBetter(String s1, String s2);
}

