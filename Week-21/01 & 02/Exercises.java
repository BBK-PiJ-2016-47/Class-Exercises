package Streams;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by hanna on 13/05/2017.
 */
public class Exercises {


    public static void main(String[] args) {
        List<Dish> foodList =
                Arrays.asList(new Dish("butter chicken", false, 500, Dish.Type.MEAT),
                new Dish("paneer wrap", true, 650, Dish.Type.OTHER),
                new Dish("pork chops", false, 700, Dish.Type.MEAT),
                new Dish("mackeral bhaji", false, 400, Dish.Type.FISH),
                new Dish("lentil daal", true, 350, Dish.Type.OTHER));

        System.out.println("Question 1: ");
        List<Dish> filtered =  foodList.stream()
                  .filter((Dish d) -> d.getType() == Dish.Type.MEAT)
                  .limit(2)
                  .collect(toList());
        System.out.println(filtered);

        System.out.println("Question 2: ");
        final long count = foodList.stream().count();
        System.out.println("There are " + count + " items in the list");

    }


}
