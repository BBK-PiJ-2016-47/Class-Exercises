
package arraytolist;

/**
 *
 * @author spencerh
 */
public class ListNode {
    private int number;
    private ListNode next;

    public ListNode(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public ListNode getNextListNode(){
        return this.next;
    }

    public void setNextListNode(ListNode nextNode){
        this.next = nextNode;
    }
}
