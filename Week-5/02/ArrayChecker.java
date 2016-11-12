public class ArrayChecker {

  public boolean isSymmetrical(int[] anArray) {
      int leng = anArray.length;
      for (int i = 0; i < leng / 2; i++) {
          if (anArray[i] != anArray[leng- i - 1]) {
              return false;
          }
      }
      return true;
  }

  public int[] reverse(int[] anArray) {
      int leng = anArray.length;
      int[] result = new int[leng];
      for (int i = 0; i < leng; i++) {
          result[leng - i - 1] = anArray[i];
      }
      return result;
  }

  public int[] checkAndReverse(int[] anArray) {
    ArrayChecker myChecker = new ArrayChecker();
    if (!myChecker.isSymmetrical(anArray)) {
        int[] reversedArray = myChecker.reverse(anArray);
        return reversedArray;
     } else {
        return anArray;
     }
  }

  public void printArray(int[] anArray) {
    for (int i = 0; i < anArray.length; i++) {
        System.out.print(anArray[i]);
    }
    System.out.println("");
  }


}