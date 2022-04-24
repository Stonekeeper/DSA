import java.util.NoSuchElementException;

public class DoublyLL {
    
    ListNode head = null;
    ListNode tail = null;
    int length = 0 ;

    DoublyLL(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public class ListNode{
        int data;
        ListNode previous;
        ListNode next;

        ListNode(int data){
            this.data = data;
        }
    }

    public Boolean isEmpty(){
        return length == 0;
    }

    public int size(){
        return length;
    }

    public void insertFront(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertEnd(int data){
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    public ListNode deleteFront(){
        if(head == null){
            throw new NoSuchElementException("List is empty");
        }
        ListNode temp = head;
        if(head == tail){
           tail = null; 
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        return temp;
        
    }

    public ListNode deleteLast(){
        if(head == null){
            throw new NoSuchElementException("The list is empty");
        }
        ListNode temp = tail;
        if(tail == head){
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        return temp;
    }

    public void printListFromHead(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.err.print("null");
    }

    public void printListFromtail(){
        ListNode temp = tail;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.print("null");
    }




    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        // dll.insertFront(10);
        // dll.insertFront(20);
        // dll.insertFront(30);
        // dll.printListFromHead();
        // dll.deleteFront();
        // dll.deleteLast();
        // dll.printListFromHead();
        // dll.printListFromtail();
        // dll.insertEnd(1);
        // dll.insertEnd(2);
        // dll.insertEnd(3);
        // dll.printListFromtail();
        // dll.printListFromHead();
    }

}
