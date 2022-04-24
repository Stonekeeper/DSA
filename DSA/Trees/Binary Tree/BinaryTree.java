import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    
    // root holds the complete tree structure
    TreeNode root;

    //Node Template
    public class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int data){
            this.data = data;
        }
    }

    //Create Binary tree
    public void createBT(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode foruth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);


        root = first;

        first.left = second;
        first.right = third;

        second.left = foruth;
        second.right = fifth;

        third.left = sixth;


    }

    //Pre Order Travresal - Recursive   
    public void preOrderRecursive(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

     //Pre Order Travresal - Iterative using Stack
     public void preOrderIretarive(TreeNode Node){
        if(root == null)
            return;
        Stack<TreeNode> S1 = new Stack<>();
        S1.push(root);

        while(!S1.isEmpty()){
            TreeNode temp = S1.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null)
                S1.push(temp.right);
            
            if(temp.left != null)
                S1.push(temp.left);
        }
     }

     //Inorder Traversal Recursive
     public void inOrderRecursive(TreeNode root){
        if(root == null)
            return;
        inOrderRecursive(root.left);
        System.out.print(root.data + " ");
        inOrderRecursive(root.right);
     }

     //In order Traversal iterative using Stack
     public void inOrderIterative(){
        if(root == null){
            return;
        }

        Stack<TreeNode> S1 = new Stack<>();
        TreeNode temp = root;

        while(!S1.isEmpty() || temp != null){
            if(temp != null){
                S1.push(temp);
                temp = temp.left;
            } else {
                temp = S1.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }

     }

     //Post Order Traversal - Recursive
     public void postOrderRecursive(TreeNode root){
         if(root == null)
            return;
        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.print(root.data + " ");
     }

     //Post order Traversal - Iteravtive using Stack
     public void postOrderIterative(){
        if(root == null)
            return;
        Stack<TreeNode> S1 = new Stack<>();
        TreeNode current = root; 
        while(current != null || !S1.isEmpty()){
            if(current != null){
                S1.push(current);
                current = current.left;
            } else {
                TreeNode temp = S1.peek().right;
                if(temp == null ){
                    temp = S1.pop();
                    System.out.print(temp.data + " ");

                    while(!S1.isEmpty() && temp == S1.peek().right ){
                        temp = S1.pop();
                        System.out.print(temp.data + " ");
                    } 
                } else {
                    current = temp;
                }
            }
        }
     }

     //Level Order Traversal using Queue
     public void levelOrder(){
        if(root == null)
            return;
        
        Queue<TreeNode> Q1 = new LinkedList<>();
        Q1.offer(root);

        while(!Q1.isEmpty()){
            TreeNode temp = Q1.poll();
            System.out.print(temp.data + " ");

            if(temp.left != null)
                Q1.offer(temp.left);
            
            if(temp.right != null)
                Q1.offer(temp.right);
        }
     }

     public void levelOrderMax(){
        if(root == null)
            return;
        TreeNode max = root;
        Queue<TreeNode> Q1 = new LinkedList<>();
        Q1.offer(root);

        while(!Q1.isEmpty()){
            TreeNode temp = Q1.poll();
           if(temp.data > max.data ){
               max = temp;
           } 

            if(temp.left != null)
                Q1.offer(temp.left);
            
            if(temp.right != null)
                Q1.offer(temp.right);
        }
        System.out.println(max.data);
     }

    //Find Max element using Recursion
    public int MaxElement(TreeNode root){
        if( root == null)
            return Integer.MIN_VALUE;
        
        int result = root.data;
        int left = MaxElement(root.left);
        int right = MaxElement(root.right);
        if(left > result)
            result = left;
        
        if(right > result)
            result = right;
        return result;
    }
    public static void main(String[] args) {
        BinaryTree B1 = new BinaryTree();

        //Pre Order Traversal
        // B1.createBT();
        // System.out.println("Recursive Preorder");
        // B1.preOrderRecursive(B1.root);
        // System.out.println("");
        // System.out.println("Iterative PreOrder");
        // B1.preOrderIretarive(B1.root);

        //In Order Traversal
        // B1.createBT();
        // System.out.println("Recursive Inorder");
        // B1.inOrderRecursive(B1.root);
        // System.out.println("");
        // System.out.println("Iterative InOrder");
        // B1.inOrderIterative();

        //Post Order
        // B1.createBT();
        // System.out.println("Recursive Post order");
        // B1.postOrderRecursive(B1.root);
        // System.out.println("");
        // System.out.println("Iterative Post Order");
        // B1.postOrderIterative();

        // Level Order Traversal
        // B1.createBT();
        // System.out.println("Inorder Travesal");
        // B1.levelOrder();

        // Max element using Level Order
        // B1.createBT();
        // System.out.println("Max Elemnet");
        // B1.levelOrderMax();

        // Level Order Traversal
        B1.createBT();
        System.out.println("Max Element is " + B1.MaxElement(B1.root));
        

    }
}
