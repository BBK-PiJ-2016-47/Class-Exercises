/**
 * Created by hanna on 13/05/2017.
 */
public class Ex04 {

    public static void main(String[] args) {
    String a = "pineapple";
    String b = "sponge";

    System.out.println("Test which is longer: ");
    System.out.println(isBetter(a, b, (s1, s2) -> s1.length()>s2.length()));

    System.out.println("Always return the first one: ");
    System.out.println(isBetter(a, b, (s1, s2) -> true));

  }

    public static String isBetter(String a, String b, TwoElementPredicate c) {
        return (c.betterE(a,b) ? a : b);

    }
}


interface TwoElementPredicate<T> {
    boolean betterE(T t1, T t2);
}