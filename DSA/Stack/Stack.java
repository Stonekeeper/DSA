public class Stack {
    Node top = null; 
    int length = 0 ;
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void push(int data){
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop(){
        Node result = top;
        top = result.next;
        length--;
        return result.data;

    }

    public int peek(){
        return top.data;
    }

    public void display(Node top){
        Node temp = top;

        while(temp != null){
            System.out.println("---");
            System.out.println("|"+temp.data+"|");
            temp = temp.next;
        }

    }


    public static void main(String[] args) {
        Stack s1 = new Stack();

        // s1.push(1);
        // s1.push(2);
        // s1.push(3);
        // s1.push(4);
        // s1.push(5);
        // s1.display(s1.top);


        // s1.pop();
        // s1.pop();
        // s1.display(s1.top);

        // for(;;){

        // }
    }
}
