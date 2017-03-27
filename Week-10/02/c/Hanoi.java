
package hanoitowers;

public class Hanoi {

    public int hanoi(int n){
        int result = 0;
        if (n > 0) {
            result = 2 * hanoi(n - 1) + 1;
        }
        return result;
    }

}
