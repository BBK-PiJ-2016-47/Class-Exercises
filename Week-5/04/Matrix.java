public class Matrix {
  private int [] [] Arr;

  public Matrix (int first, int second) {
    Arr = new int[first][second];
  } 

  public setElement (int first, int second, int elem) {
    if (first > Arr.length) {
      System.out.println("Your first parameter is too large!")
    } else if (second > Arr[0].length) {
      System.out.println("Your second parameter is too large!")
    } else {
      Arr[first][second] = elem;
    }
  }

  public 


}