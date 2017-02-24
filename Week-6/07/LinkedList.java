package arraytolist;

/**
 *
 * @author spencerh
 */
public class LinkedList {
    private ListNode head = null;
    private ListNode current = null;
    private int counter = 0;

    public void addNumber(int number){
        ListNode num = new ListNode(number);

        if (head == null){
            head = num;
            System.out.println("New number " + num.getNumber() + " has been added");
            counter++;
            return;
        }
        
        current = this.head;
        while(current.getNextListNode() != null){
            current = current.getNextListNode();
        }

        current.setNextListNode(num);
        counter++;
        System.out.println("New number " + num.getNumber() + " has been added");
    }

}
