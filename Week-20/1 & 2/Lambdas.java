import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class Lambdas {

    public static void main(String[] args) {
        System.out.println("Question 1: ");
        String[] lambdaArr = {"Hello", "Bonjour", "Hola"};
        Arrays.parallelSort(lambdaArr, Comparator.comparing(s -> s.length()));
        System.out.println("Array in order of length: ");
        print(lambdaArr);

        System.out.println("==============");
        Arrays.parallelSort(lambdaArr, Comparator.comparing(s -> s.length()));
        Collections.reverse(Arrays.asList(lambdaArr));
        System.out.println("Array in reverse order of length: ");
        print(lambdaArr);

        System.out.println("==============");
        Arrays.parallelSort(lambdaArr, Comparator.comparing(s -> s.charAt(0)));
        System.out.println("Array in order of first character: ");
        print(lambdaArr);

        System.out.println("==============");
        Arrays.sort(lambdaArr, (s1, s2) -> { int check = 0;
        if (s1.contains("e") && !s2.contains("e")) { check = -1; }
        else if (s2.contains("e") && !s1.contains("e")) { check = 1; }
        return (check); });
        System.out.println("Array in order of if there is an e: ");
        print(lambdaArr);

        System.out.println("==============");
        System.out.println("==============");

        System.out.println("Question 2: ");

        System.out.println("Array in order of if there is an e using static method: ");
        Arrays.sort(lambdaArr, Lambdas::eChecker);
        print(lambdaArr);
    }

    public static int eChecker(String s1, String s2) {
        int check = 0;
        if (s1.contains("e") && !s2.contains("e")) {
            check = -1;
        } else if (s2.contains("e") && !s1.contains("e")) {
            check = 1;
        }
        return (check);
    }

    public static void print(String[] lambdaArr) {
        for (int i = 0; i < lambdaArr.length; i++) {
            System.out.println(lambdaArr[i]);
        }
    }
}