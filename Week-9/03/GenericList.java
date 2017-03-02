/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package genericlists;

/**
 *
 * @author spencerh
 */
public class GenericList<T> {

    	private ListNode<T> head = null; //first item
        private ListNode<T> tail = null;
        private ListNode<T> current = null; //traverser
	private int count = 0;


        public void addItem(T newItem) {
            ListNode<T> item = new ListNode<T>(newItem);
            //if this is the first item
            if (head == null) {
		head = item;
                tail = item;
                 System.out.println("Item " + item.getContent() + " has been added");
                 count++;
		return;
            }
            current = this.head;
            while(current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(item);
            item.setPrevNode(current);
            tail = item;
            count++;
            System.out.println("Item " + item.getContent() + " has been added");
        }

        public void deleteItem(T itemToRemove) {
            ListNode<T> item = new ListNode<T>(itemToRemove);
            if (head == null) {
                System.out.println("There are no items to delete!");
                return;
            }
            current = this.head;
            
           //if first item
            if (current.getContent().equals(item.getContent())) {
                head = head.getNextNode();
                System.out.println(itemToRemove + " has been deleted");
                return;
            }

            while(current.getNextNode() != null) {
                if (current.getNextNode().getContent().equals(item.getContent())) {
                   current.setNextNode(current.getNextNode().getNextNode());
                    tail = current.getNextNode().getNextNode();
                        if (tail != null) {
                             tail.setPrevNode(tail.getPrevNode().getPrevNode());
                        }
              System.out.println(itemToRemove + " has been deleted");
              return;
                } else {
              current = current.getNextNode();
               }

            }

            if (current.getNextNode() == null && current.getContent() != item.getContent()){
                System.out.println(itemToRemove + " wasn't found!");
            }

            
            
            



    }




        public void printList(){
            if (head == null) {
		System.out.println("No items in the list!");
		return;
            }

            current = this.head;
            do {
                System.out.println("Items: " + current.getContent());
                current = current.getNextNode();

            } while(current != null) ;

        }
/*
        public void printPatientListBackwards(){
            if(head == null) {
                System.out.println("No patients in the hospital!");
		return;
            }
            current = this.head;
            while (current.getNextPatient() != null){
                current = current.getNextPatient();
            }
            do {
                System.out.println("Name   : " + current.getName());
		System.out.println("Illness: " + current.getIllness());
		System.out.println("Age    : " + current.getAge());
                current = current.getPreviousPatient();
            } while(current != null);

        }
 *
 */
}
