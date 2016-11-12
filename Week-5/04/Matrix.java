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
      System.out.println("Your first parameter is too large!");
    } else if (second > Arr[0].length) {
      System.out.println("Your second parameter is too large!");
    } else {
      Arr[first][second] = elem;
    }
  }

  public void setRow(int rowNum,String input) {
    

  }

  public void setColumn(int param, String input) {

  }

  public String toString() {

    String strarr = "[";
    for(int i = 0; i < Arr.length; i++) {
      strarr = strarr + ";";
      for(int j = 0; j < Arr[i].length; j++) {
       strarr = strarr + Arr[i][j] + ",";   
      }
    }
    strarr = strarr + "]";
    return strarr;
  }

  public void prettyPrint() {
      for(int i = 0; i < Arr.length; i++) {
      for(int j = 0; j < Arr[i].length; j++) {
       System.out.println(Arr[i][j]); 
      }
    }
  }
}