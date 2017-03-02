/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package genericlists;

/**
 *
 * @author spencerh
 */
public class ListNode<T> {
    private T contents;
    private ListNode next;
    private ListNode prev;

    public ListNode(T object){
        this.contents = object;
    }

    public T getContent() {
        return this.contents;
    }

    public void setContent(T content) {
        this.contents = content;
    }

    public ListNode getPrevNode(){
        return prev;
    }

    public void setPrevNode(ListNode node){
        this.prev = node;
    }

    public ListNode getNextNode(){
        return next;
    }

    public void setNextNode(ListNode node){
        this.next = node;
    }
}
