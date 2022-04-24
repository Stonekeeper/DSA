public class SinglyLL {

    //first node
    public ListNode head;

    //To create a Node with Data and link fields
    public static class ListNode{
 
        public int data;
        public ListNode next;

        //Constructor
        public ListNode(int data){

            this.data = data;
            this.next = null;
        }
    }

    //Display the contents of the list
    public void display(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("Null: End of List");
    }

    //Display the length of the list
    public void lenght(){
        ListNode current = head;
        int count = 0;
        if(current == null)
        {
            System.out.println("List is empty");
        } else {
            while(current != null){
                current = current.next;
                count++;
            }
        System.out.println("Lenght = "+count);
        }
        
    }

    //To insert in the Beginning of the list
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    //To insert at the end of the list
    public void insertEnd(int value){
        //Creates a new node everytime function is called
        ListNode newNode = new ListNode(value);
        //if the list is empty
        if(head == null){
            head = newNode;
            return;
        }
        //Create a temprarory node to traverse the list to find the end of the list 
        ListNode current = head;
        //Find the last node in list
        while(current.next != null){
            current = current.next;
        }
        //assign the end node with new node
        current.next = newNode;
    }

    public void insertPos(int pos,int value){
        ListNode newNode = new ListNode(value);
        int count=1;
        //If the pos is 1st
        if(pos == 1){
            newNode.next = head;
            head = newNode;
        } else {
            //temp Node to traverse till the pos  
            ListNode previousNode = head;

            //Traverse till the pos-1 node
            while(count < pos-1){
                previousNode = previousNode.next;
                count++;
            }
            // //Keeps track of the address of the next nodes in the list 
            // ListNode currentNode = previousNode.next;
            // //assign new node to the previous node next section
            // previousNode.next = newNode;
            // //assign new node next section with current node 
            // newNode.next = currentNode;

            newNode.next = previousNode.next;
            previousNode.next = newNode;
        }
    }

    //Delete from front
    public ListNode deleteFirst(){
        if (head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    //Delete from end
    public ListNode deleteEnd(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode currentNode = head;
        ListNode previousNode = null;

        while(currentNode.next != null){
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        previousNode.next = null;
        return currentNode;
    }

    //Delete from pos
    public void deletePos(int pos){
        if(pos == 1){
            head = head.next;
        }
        ListNode previousNode = head;
        int count = 1;

        while ( count < pos -1){
            previousNode = previousNode.next;
            count++;
        }
        ListNode currentNode = previousNode.next;
        previousNode.next = currentNode.next;
    }


    //Search Element
    public boolean searchKey(int key){
        ListNode currentNode = head;
        if(head == null){
            return false;
        }
        while(currentNode != null){

            if(currentNode.data == key ){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
        
        
    }

    //Reverse List
    public ListNode reverseList(ListNode head){
        //if the list is empty
        if(head == null){
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while(current !=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        System.out.println("Reverse of List");
        //the previous consists of head 
        return previous;
    }

    //Middle of the list 
    public ListNode mid(ListNode head){
        if(head == null){
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    //Get N th node from the list from end 
    public ListNode getElementFromLast(ListNode head,int pos){
        ListNode current = head;
        int length=0;
        //Find the length of the list
        while(current != null){
               current = current.next;
               length++;
        }
        current = head;
        int count=0;
        //Traverse to the posistion 
        while(count < length-pos){
            current = current.next;
            count++;
        }
        return current;
    }

    //Remove the duplicates from the sorted list
    public void removeDuplicate(ListNode head){
        if(head == null){
            return;
        }
        ListNode current= head;

        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

    }

    //Insert element in the sorted list
    public ListNode insertInSortedList(ListNode head, int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            return head;
        }
        ListNode current = head;
        ListNode temp = null;

        while(current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    //Delete Key from the list
    public void deleteKey(int key){
        ListNode current = head;
        ListNode temp = null;

        //if the element is in the first position
        if(current != null && current.data == key){
            head = current.next;
            return;
        }

        while(current != null && current.data != key){
            temp = current;
            current = current.next;
        }
        if(current == null){
            return;
        }
        temp.next = current.next;
        
    }



    //List consist of the loop
    public void CreateListWithLoop(){

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third= new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode six = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = third  ;

    }

        //To find loop in the list
        public boolean findLoop(){
            if(head == null){
                return false;
            }
            ListNode fastPtr = head;
            ListNode slowPtr = head;
    
            while(fastPtr != null && fastPtr.next != null){
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
                if(slowPtr == fastPtr){
                    return true;
                }
            }
            return false;
        }

        //To find Start node in the loop 
        public ListNode findLoopStartingNode(){
            if(head == null){
                return null;
            }
            ListNode fastPtr = head;
            ListNode slowPtr = head;
    
            while(fastPtr != null && fastPtr.next != null){
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
                if(slowPtr == fastPtr){
                    return getLoopStartingNode(slowPtr);
                }
            }
            return null;
        }
        
        //To find Start node in the loop 
        public ListNode getLoopStartingNode(ListNode slowPtr){
            ListNode temp = head;

            while(temp != slowPtr){
                temp = temp.next;
                slowPtr = slowPtr.next;
            }
            return temp;
    
        }

        //Remove loop
        public void removeLoop(){
            if(head == null)
                return;
            ListNode slowPtr = head;
            ListNode fastPtr = head;
            while(fastPtr != null && fastPtr.next != null){
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next.next;

                if(slowPtr == fastPtr){
                    removeLoop(slowPtr);
                    return;
                }
            }
        }
        
        //remove loop
        public void removeLoop(ListNode slowPtr){

            ListNode temp = head;

            while(temp.next != slowPtr.next){
                temp = temp.next;
                slowPtr = slowPtr.next;
            }
            slowPtr.next = null;            
        }

        //Merge two sorted list
        public ListNode merge(ListNode a, ListNode b){
            ListNode dummy = new ListNode(0);
            ListNode tail = dummy;
            while(a != null && b!= null){
                if(a.data <= b.data){
                    tail.next = a;
                    a = a.next;
                } else {
                    tail.next = b;
                    b = b.next;
                }
                tail = tail.next;
            }

            if(a == null){
                tail.next = b;
            } else {
                tail.next = a;
            }
            return dummy.next;
        }
    public static void main(String[] args) {

        SinglyLL sll = new SinglyLL();


        // sll.head = new ListNode(10);
        // ListNode second = new ListNode(20);
        // ListNode third = new ListNode(30);
        // ListNode fourth = new ListNode(40);
        // ListNode fifth = new ListNode(50);

        // sll.head.next = second;   
        // second.next = third;
        // third.next = fourth;
        // fourth.next = fifth;

        // sll.insertFirst(3);
        // sll.insertFirst(2);
        // sll.insertFirst(1);

        // sll.insertEnd(1);
        // sll.insertEnd(2);
        // sll.insertEnd(4);
        // sll.insertEnd(5);
        // sll.insertEnd(6);
        // sll.insertEnd(7);


        // sll.insertPos(1, 1);
        // sll.insertPos(2, 2);
        // sll.insertPos(1, 3);
        // sll.insertPos(2, 4);
        // sll.insertPos(5,5);

        // sll.display(sll.head);
        // sll.lenght();

        // System.out.println(sll.deleteFirst().data);
        // System.out.println(sll.deleteFirst().data);

        // System.out.println(sll.deleteEnd().data);
        // System.out.println(sll.deleteEnd().data);

        // sll.deletePos(2);
        // sll.display();
        // if(sll.searchKey(7)){
        //     System.out.println("Element is found");
        // } else{
        //     System.out.println("Element is not found");
        // }

    //    ListNode rev = sll.reverseList(sll.head);
    //     sll.display(rev);

    // ListNode mid = sll.mid(sll.head);
    // System.out.print(mid.data);

    // ListNode pos = sll.getElementFromLast(sll.head, 2);
    // System.out.println(pos.data + " is the element from last ");

    // sll.removeDuplicate(sll.head);
    // sll.display(sll.head);

    // sll.insertInSortedList(sll.head, 3);
    // sll.display(sll.head);
    
    // sll.deleteKey(1);
    // sll.display(sll.head);

    // sll.CreateListWithLoop();
    // System.out.println(sll.findLoop());

    // sll.CreateListWithLoop();
    // System.out.println(sll.findLoop());
    // System.out.println(sll.findLoopStartingNode().data);
    // sll.removeLoop();
    // System.out.println(sll.findLoop());
    // sll.display(sll.head);
    
    SinglyLL sll1 = new SinglyLL();
    SinglyLL sll2 = new SinglyLL();

    sll1.insertEnd(1);
    sll1.insertEnd(3);
    sll1.insertEnd(5);
    sll1.insertEnd(6);
    sll.display(sll1.head);       
    sll2.insertEnd(2);
    sll2.insertEnd(4);
    sll2.insertEnd(7);
    sll2.insertEnd(8);
    sll2.insertEnd(9);
    sll2.insertEnd(10);
    sll2.insertEnd(11);
    sll.display(sll2.head);       

    ListNode merge = sll.merge(sll1.head, sll2.head);
    sll.display(merge);

    

    
    



    }

}
