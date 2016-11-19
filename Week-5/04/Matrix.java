public class Matrix {
  private int [] [] Arr;
  private int row;
  private int column;

  public Matrix (int row, int column) {
    this.row = row;
    this.column = column;
    Arr = new int[row][column];
    for(int i = 0; i < row; i++) {
      for(int j = 0; j < column; j++) {
       Arr[i][j] = 1;    
      }
    } 
  } 

  public void setElement (int row, int column, int elem) {
    if (row > Arr.length) {
      System.out.println("Your first parameter is too large!");
    } else if (column > Arr[0].length) {
      System.out.println("Your second parameter is too large!");
    } else {
      Arr[row][column] = elem;
    }
  }
/*
  public void setRow(int rowNum,String input) {
    if (rowNum > this.row) {
      System.out.println("That's too many rows!");
    } else {
      int [] temp = input.split(",");

    }

  }
*/
  public void setColumn(int colNum, String input) {
    if (colNum > this.column) {
      System.out.println("That's too many columns!");
    } else {
    

    }

  }

  public String toString() {

    String strArr = "[";
    for(int i = 0; i < Arr.length; i++) {
      strArr = strArr + ";";
      for(int j = 0; j < Arr[i].length; j++) {
       strArr = strArr + Arr[i][j] + ",";   
      }
    }
    strArr = strArr + "]";
    return strArr;
  }

  public void prettyPrint() {
      for(int i = 0; i < Arr.length; i++) {
      for(int j = 0; j < Arr[i].length; j++) {
       System.out.print(Arr[i][j] + ", "); 
      }
    }
  }
}