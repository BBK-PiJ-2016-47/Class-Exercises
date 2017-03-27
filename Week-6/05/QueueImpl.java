package queue;


public class QueueImpl {

    private int[] storage;
    
    public void insert(int newElement) {
        //inserts an element at the beginning of the queue
        if (storage == null){
            storage = new int[1];
            storage[0] = newElement;
            System.out.println("Inserting request " + storage[0] + "...");
            return;
        }
        int arrLeng = size();
        int[] temp = new int[arrLeng];
        for(int i = 0; i < arrLeng; i++) {
            temp[i] = storage[i];
        }
        storage = new int[arrLeng + 1];
        storage[0] = newElement;
        for(int j = 0; j < arrLeng; j++) {
            storage[j+1] = temp[j];
        }
        System.out.println("Inserting request " + storage[0] + "...");
    }
    
    public void retrieve() {
        int arrLeng = size();
        if (storage == null) {
            return;
        }
        int[] temp = new int[arrLeng];
        System.out.print("Retrieving request " + storage[arrLeng - 1]);
        for(int i = 0; i < arrLeng; i++) {
            temp[i] = storage[i];
        }
        
        storage = new int[arrLeng - 1];
        for(int j = 0; j < arrLeng - 1; j++) {
            storage[j] = temp[j];
        }
        System.out.println("...done");
    }

    public int size() {
        if (storage == null) {
            System.out.println("There are no requests in the queue");
            return 0;
        }
        System.out.println("There are " + storage.length + " requests in the queue");
        return storage.length;
    }

}
