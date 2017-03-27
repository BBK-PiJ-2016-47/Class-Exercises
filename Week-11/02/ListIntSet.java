package treesassets;

/**
 *
 * @author spencerh
 */
public class ListIntSet implements IntSet {
    private int value;
    private ListIntSet next;
    
    public ListIntSet(int value){
        this.value = value;
        this.next = null;
    }

    @Override
    public void add(int newNumber){
        if(!contains(newNumber)){
            ListIntSet newNode = new ListIntSet(newNumber);
            if(this.next == null){
                this.next = newNode;
                return;
            }
            ListIntSet current = this.next;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public boolean contains(int value){
      boolean contained = false;
      if (this.value == value){
         return true;
      }

      if(this.next != null) {
        return this.next.contains(value);
      }
      return false;
  }


  @Override
  public boolean containsVerbose(int value){
      boolean contained = false;
      if (this.value == value){
          System.out.println("Value checked: " + this.value);
          contained = true;
      }
      ListIntSet current = this.next;
      while(current.next != null && current.value != value) {
          System.out.println("Value checked: " + current.value);
          current = current.next;
          if (current.value == value){
            contained = true;
            break;
          }
      }

      return contained;
  }

  @Override
  public String toString(){
    StringBuilder toPrint = new StringBuilder("" + this.value);
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



