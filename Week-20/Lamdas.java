import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class Lambdas {

    public static void main(String[] args) {
        String[] lamdaArr = {"Hello", "Bonjour", "Hola"};
        Arrays.parallelSort(lamdaArr, Comparator.comparing(s -> s.length()));
        System.out.println("Array in order of length: ");
        print(lamdaArr);

        System.out.println("==============");
        Arrays.parallelSort(lamdaArr, Comparator.comparing(s -> s.length()));
        Collections.reverse(Arrays.asList(lamdaArr));
        System.out.println("Array in reverse order of length: ");
        print(lamdaArr);

        System.out.println("==============");
        Arrays.parallelSort(lamdaArr, Comparator.comparing(s -> s.charAt(0)));
        System.out.println("Array in order of first character: ");
        print(lamdaArr);

        System.out.println("==============");

    }

    public static void print(String[] lamdaArr) {
        for (int i = 0; i < lamdaArr.length; i++) {
            System.out.println(lamdaArr[i]);
        }
    }
}