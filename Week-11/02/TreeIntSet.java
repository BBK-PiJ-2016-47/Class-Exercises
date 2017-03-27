
package treesassets;

/**
 *
 * @author spencerh
 */
public class TreeIntSet implements IntSet {
    int value;
    TreeIntSet left;
    TreeIntSet right;
    
    public TreeIntSet(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

  @Override
  public void add(int newNumber) {
      if (newNumber > this.value) {
            if (right == null) {
                right = new TreeIntSet(newNumber);
            } else {
                right.add(newNumber);
            }
        } else {
            if (left == null) {
                left = new TreeIntSet(newNumber);
            } else {
                left.add(newNumber);
            }
        }
  }

  @Override
  public boolean contains(int checkNumber){
    boolean containsNumber = false;
    if (checkNumber > this.value) {
        if (right == null){
            containsNumber = false;
        } else if (right.value != checkNumber) {
            right.contains(checkNumber);
        }else {
            containsNumber = true;
        }
    } else {
        if (left == null){
            containsNumber = false;
        } else if (left.value != checkNumber) {
            left.contains(checkNumber);
        }else {
            containsNumber = true;
        }
    }
    return containsNumber;
  }

  @Override
  public boolean containsVerbose(int checkNumber){
      boolean containsNumber = false;
      System.out.println("Value checked: " + this.value);
      if (checkNumber == this.value) {
          return true;
      } else {
          if (checkNumber > this.value) {
              if (right == null){
                  containsNumber = false;
              } else if (right.value != checkNumber) {
                  right.containsVerbose(checkNumber);
              }else {
                  containsNumber = true;
              }
          } else {
              if (left == null){
                  containsNumber = false;
              } else if (left.value != checkNumber) {
                  left.containsVerbose(checkNumber);
              } else {
                  containsNumber = true;
              }
          }
          return containsNumber;
      }
    }



/*
 * returns a string with the values of the elements in the set separated by commas.
 *
 */
@Override
public String toString(){
    TreeIntSet current = this;
    while(current.left != null){
        current = current.left;
    }
    StringBuilder toPrint = new StringBuilder("" + current.value);
    if (this.next == null) {
      return toPrint.toString();
    }
    ListIntSet current = this.next;
    while (current.next != null) {
      toPrint.append(", " + current.value);
      current = current.next;
    }
    toPrint.append(", " + current.value);
    return toPrint.toString();
  }

}


}
