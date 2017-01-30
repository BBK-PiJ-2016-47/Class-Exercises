import java.util.HashMap;
import java.util.Map;
import java.time.Duration;
import java.time.Instant;

public class MemoFib {
	
  private int[] precalculated = null;

  public int fib(int n) {
    if (precalculated == null) {
      initPrecalculatedArray(n);
    }
    if (precalculated[n-1] != -1) {
      return precalculated[n-1];
    } else {
      int result = fib(n-1) + fib(n-2);
      precalculated[n-1] = result;
      return result;
    }
  }

  private void initPrecalculatedArray(int size) {
    precalculated = new int[size];
    for (int i = 0; i < precalculated.length; i++) {
      precalculated[i] = -1; // to indicate "not calculated yet"
    }
    precalculated[0] = 1; // F(1)
    precalculated[1] = 1; // F(2)
  }
  	
  public static void main(String[] args) {
	  MemoFib testing = new MemoFib();
	  System.out.println(testing.fib(40));
	  System.out.println(testing.fib(45));
	  
  }

}