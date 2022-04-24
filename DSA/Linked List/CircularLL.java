import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;

public class CircularLL {
    ListNode last;
    int length;

    public class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
        }
    }

    CircularLL(){
        this.last = null;
        this.length = 0;
    }

    public int size(){
        return length;
    }

    public Boolean isEmpty(){
        return length == 0;
    }

    public void insertFront(int data){
        ListNode newNode = new ListNode(data);

        if(last == null ){
            last = newNode;
        } else {
            newNode.next = last.next;
        }
        last.next = newNode;
        length++;
    }

    public void insertEnd(int data){
        ListNode newNode = new ListNode(data);
        if(last == null){
            last = newNode;
            last.next = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public void printCLL(){
        if(last == null)
            return;

        ListNode temp = last.next;
        while(temp != last ){
            System.out.print(temp.data +"-->");
            temp = temp.next;
        }
        System.out.print(temp.data +"-->");
    }

    public ListNode deleteFront(){
        if(last == null)
            return null;
        
        ListNode temp = last.next;
        if(last == last.next){
            last = null;
        } else {
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }

    public ListNode deleteEnd(){
        if(last == null)
            return null;
        
        ListNode temp = last;
        ListNode first = last.next;
        if (last == last.next) {
            last.next = null;
            last = null;

        } else {
            while ( first.next != last) {
                first = first.next;
            }
            first.next = last.next;
            last.next = null;
            last = first;
        }

        return temp;
    }
    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.insertEnd(1);
        cll.insertEnd(2);
        cll.printCLL();
        cll.deleteFront();
        cll.deleteEnd();
        cll.printCLL();

    }
}
