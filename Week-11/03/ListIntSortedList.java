
package treesassortedsets;

/**
 *
 * @author spencerh
 */
public class ListIntSortedList implements IntSortedList {
    private int value;
    private ListIntSortedList next;
    
    public ListIntSortedList(int value){
        this.value = value;
        this.next = null;
    }
    
    public void add(int value){ //doesn't work for the second to last
      ListIntSortedList newNode = new ListIntSortedList(value);
      if(this.next == null){
        this.next = newNode;
        return;
      }
      ListIntSortedList head = this;
      if(newNode.value < head.value){
          newNode.next = head;
          return;
      }

      ListIntSortedList current = this.next;
        while(current.next != null){
          if (this.next.value > value){
              newNode.next = this.next;
              this.next = newNode;
              return;
          }
          current = current.next;
        }
        current.next = newNode;
    }


public boolean contains(int value){
      if (this.value == value){
         return true;
      }

      if(this.next != null) {
        return this.next.contains(value);
      }
      return false;
}


public String toString(){
StringBuilder toPrint = new StringBuilder("" + this.value);
    if (this.next == null) {
      return toPrint.toString();
    }
    ListIntSortedList current = this.next;
    while (current.next != null) {
      toPrint.append(", " + current.value);
      current = current.next;
    }
    toPrint.append(", " + current.value);
    return toPrint.toString();

}
}
