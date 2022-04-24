import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;


public class Queues {

    Node front = null;
    Node rear = null; 
    int length = 0;
    
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void enqueue(int data){
        Node temp = new Node(data);

        if(isEmpty()){
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }
    
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int result = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        length--;
        return result;
    }

    public int first(){
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return front.data;
    }

    public int last(){
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return rear.data;
    }

    public void display(Node front){
        if(isEmpty())
            return;
            
        Node current = front;
        while(current != null){
            System.out.print(current.data + " <--");
            current = current.next;
        }
        System.out.println();
    }


    //Generate Binary numbers
    public String[] generateBinary(int n){
        String[] binary = new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1");

        for (int i = 0; i < n; i++) {
            binary[i] = q.poll();
            String n1 = binary[i] +"0";
            String n2 = binary[i] +"1";           
            q.offer(n1);
            q.offer(n2);             
        }
        return binary;
    }

    public static void main(String[] args) {
        Queues q1 = new Queues();

        // q1.enqueue(10);
        // q1.enqueue(20);
        // q1.enqueue(30);
        // q1.display(q1.front);
        // q1.dequeue();
        // q1.dequeue();

        // q1.display(q1.front);

        // System.out.println(q1.first());
        // System.out.println(q1.last());
       String[] res = q1.generateBinary(5);
       for (String s : res) {
        System.out.println(s);
       }
       



    }
}
