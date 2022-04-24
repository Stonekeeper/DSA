public class MaxPQ {
    public Integer[] heap;
    int n;
    
    public MaxPQ(int capacity){
        heap = new Integer[capacity +1];
        n = 0;
    }

    public int size(){
        return n;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public void insert(int data){
        if(n == heap.length-1 ){
            resize(2*heap.length);
        }
        n++;
        heap[n] = data;
        swim(n); // Call for Bottom Up Heapify
    }

    public void resize(int capacity){
        Integer[] temp = new Integer[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    //Bottom up heapify Method
    public void swim(int k){
        while (k > 1 && heap[k/2] < heap[k] ) {
            int temp = heap[k];
            heap[k] = heap[k/2];
            heap[k/2] = temp;
            k=k/2; //Goes to the parent node of  Current K and sets k value to current node's parent index 
        }
    }

    public void printPQ(){
        for (int i = 1; i < heap.length; i++) {
            System.out.print(heap[i]+ " ");
        }
    }
    public static void main(String[] args) {
        MaxPQ pq = new MaxPQ(3);
        pq.insert(2);
        pq.insert(4);
        pq.insert(5);
        pq.insert(1);
        pq.insert(3);
        pq.insert(9);
        pq.insert(6);
        pq.insert(10);
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
        pq.printPQ();
    }
}
