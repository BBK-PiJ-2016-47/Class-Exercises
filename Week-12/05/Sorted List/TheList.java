
package sortedlist;

/**
 *
 * @author spencerh
 */
public class TheList {
    private ListNode head;
    private int counter = 0;


    public void addItem(int n) {

        ListNode newInt = new ListNode(n);
        ListNode current = head;
        counter++;

        if (head == null) {
            head = newInt;
            System.out.println(n + " has been added to the list!");
            return;
        }
        if (n < head.value) {
            newInt.next = head;
            head = newInt;
            System.out.println(n + " has been added to the list!");
            return;
        }
       
                while(current.next != null && n > current.next.value){
                    current = current.next;

                }
                newInt.next = current.next;
                current.next = newInt;

    }

        
    

    public void printWholeList() {
        if (counter == 0) {
            System.out.println("There's nothing to print!");
        } else {
           for(int i = 0; i < counter; i++) {
               System.out.println(head.value);
               head = head.next;
           }
        }
    }

}
