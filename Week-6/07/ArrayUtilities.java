package arraytolist;

/**
 * Create a static method that takes an array of integers and returns a linked list of integers in the same order as
 * the original array. You can put this method in a class called ArrayUtilities so that you can easily use it for the
 * following exercises.
 * (Note: This is what the method Arrays.asList(...) from the core Java library does (you can look it up!).
Class Arrays contains several static methods to operate with arrays. Before you can use this class properly, we
need to learn about generic types (e.g. things that look like <T> List<T>) and we will do that soon.)
 * @author spencerh
 */
public class ArrayUtilities {
    private int[] intArr;
    
    
    public LinkedList turnIntoList(int[] intArr) {
        LinkedList arrToList = new LinkedList();

        int i = 0;
        while(i < intArr.length){
            arrToList.addNumber(intArr[i]);
            i++;
        }
        return arrToList;
    }



}
