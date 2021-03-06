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
	int rows = this.row;
	int columns = this.column;
    if (row > rows) {
      System.out.println("Your first parameter is too large!");
    } else if (column > columns) {
      System.out.println("Your second parameter is too large!");
    } else {
      Arr[row][column] = elem;
    }
  }

  public void setRow(int rowNum, String input) {
	int rows = this.row;
	int columns = this.column;
    if (rowNum > rows) {
		System.out.println("This row doesn't exist!");
    } else {
		int strLength = input.length();
		int counter = 1;
		char charac = '\0';
		String comma = "";
		for (int i = 0; i < strLength; i++) {
			charac = input.charAt(i);
			comma = String.valueOf(charac);
			if (comma.equals(",")) {
				counter++;
				}
			}
			String [] strArr = new String [counter];
			strArr = input.split(",");
			int j = rowNum;
			for (int n = 0; n < counter; n++) {
				Arr[j][n] = Integer.parseInt(strArr[n]);
			}
	}
  }

  public void setColumn(int colNum, String input) {
    if (colNum > this.column) {
      System.out.println("That's too many columns!");
    } else {
    int strLength = input.length();
		int counter = 1;
		char charac = '\0';
		String comma = "";
		for (int i = 0; i < strLength; i++) {
			charac = input.charAt(i);
			comma = String.valueOf(charac);
			if (comma.equals(",")) {
				counter++;
				}
			}
			String [] strArr = new String [counter];
			strArr = input.split(",");
			int j = colNum;
			for (int n = 0; n < counter; n++) {
				Arr[n][j] = Integer.parseInt(strArr[n]);
			}
	

    }

  }

  public String toString() {
	int rows = this.row;
	int columns = this.column;
    String strArr = "[";
    for(int i = 0; i < rows; i++) {
      for(int j = 0; j < columns; j++) {
       strArr = strArr + Arr[i][j] + ",";   
      }
	  int leng = strArr.length();
	  strArr = strArr.substring(0,(leng-1));
	  strArr = strArr + "; ";
    }
    strArr = strArr + "]";
    return strArr;
  }

  public void prettyPrint() {
	  int rows = this.row;
	  int columns = this.column;
      for(int i = 0; i < rows; i++) {
      for(int j = 0; j < columns; j++) {
       System.out.print(Arr[i][j] + "\t"); 
      }
	  System.out.println("");
    }
  }
}