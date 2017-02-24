/*
 * Create a class that extends String and adds a method printEven() that prints on screen the even-numbered
 * characters of the string. Try to compile it and see what happens.
 */

public class ExtendedString extends String {



    public void printEven(String input) {
        for (int i = 0; i < input.length(); i = i + 2) {
            System.out.println(input.charAt(i));
    }

    }

}

/*
 * This will not compile because String is a final class and cannot
 * be inherited from
 */
