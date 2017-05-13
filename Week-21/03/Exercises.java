package Streams;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Exercises {


    public static void main(String[] args) {
        List<Integer> intArr = new ArrayList<>();
        intArr.add(1);
        intArr.add(2);
        intArr.add(3);
        intArr.add(4);
        intArr.add(5);

        List<Integer> result =
                intArr.stream()
                        .map((n) -> n*n)
                        .collect(toList());
        System.out.println(result);

        List<int[]> pairedResult =
                intArr.stream()
                        .flatMap(i -> result.stream()
                                .map(j-> new int[]{i,j}))
                        .collect(toList());

        System.out.print(pairedResult);

    }


}
