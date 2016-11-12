public class Matrix {
  private int [] [] Arr;

  public Matrix (int first, int second) {
    Arr = new int[first][second];
    for(int i = 0; i < first; i++) {
      for(int j = 0; j < second; j++) {
       Arr[i][j] = 1;    
      }

    }
    
  } 

  public void setElement (int first, int second, int elem) {
    if (first > Arr.length) {
      System.out.println("Your first parameter is too large!")
    } else if (second > Arr[0].length) {
      System.out.println("Your second parameter is too large!")
    } else {
      Arr[first][second] = elem;
    }
  }

  public void setRow(int param,String input) {
    int inpt = Integer.Parseint(input);
    if (param > input numbers)

  }

  public void setColumn(int param, String input) {

  }

  public String toString() {

  }

  public void prettyPrint() {

  }
}