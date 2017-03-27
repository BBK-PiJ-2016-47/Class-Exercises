

package queue;


public class StackImpl {
    
    private int[] storage;
    
  public void push(int newElement) {
    //pushes an element at the beginning of the stack
    if (empty()){
      storage = new int[1];
      storage[0] = newElement;
      System.out.println("Pushing request " + storage[0] + "...");
      return;
    }
    int arrLeng = storage.length;
    int[] temp = new int[arrLeng];
    for(int i = 0; i < arrLeng; i++) {
      temp[i] = storage[i];
    }
    storage = new int[arrLeng + 1];
    storage[0] = newElement;
    for(int j = 0; j < arrLeng; j++) {
      storage[j+1] = temp[j];
    }
    System.out.println("Pushing request " + storage[0] + "...");
  }

  public void pop() {
    int arrLeng = storage.length;
    if (empty()) {
      return;
    }
    int[] temp = new int[arrLeng];
    System.out.print("Popping request " + storage[0]);
    for(int i = 0; i < arrLeng; i++) {
      temp[i] = storage[i];
    }

    storage = new int[arrLeng - 1];
    for(int j = 0; j < arrLeng - 1; j++) {
      storage[j] = temp[j+1];
    }
    System.out.println("...done");
  }
public void print() {
    for(int i = 0; i < storage.length; i++) {
        System.out.println(storage[i]);
    }
}
  public boolean empty() {
    boolean empty = false;
    if(storage == null) {
      empty = true;
      System.out.println("There are no items on the stack");
    }
    return empty;
  }
}
