public class BinarySearchTree {

    public TreeNode root;
    
    public class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
        }
    }

    // public void createBST(){
    //     TreeNode first = new TreeNode(6);
    //     TreeNode second = new TreeNode(4);
    //     TreeNode third = new TreeNode(8);
    //     TreeNode fourth = new TreeNode(2);
    //     TreeNode fifth = new TreeNode(5);
    //     TreeNode sixth = new TreeNode(7);
    //     TreeNode seventh = new TreeNode(9);

    //     root = first;
    //     first.left = second;
    //     first.right = third;

    //     second.left = fourth; 
    //     second.right = fifth;

    //     third.left = sixth;
    //     third.right = seventh;

    // }

    public void insertBST(int val){
        root = insertBST(root, val);
    }

    public TreeNode insertBST(TreeNode root,int val){
        if(root == null){
            root = new TreeNode(val);
            return root;
        }

        if (val < root.data) {
            root.left = insertBST(root.left, val);
        } else {
            root.right = insertBST(root.right, val);
        }
        return root;
    }

    public void inOrder(TreeNode root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public TreeNode search(int key){
        return search(root, key);
    }
    public TreeNode search(TreeNode root,int key){
        if(root == null || root.data == key)
            return root;
        
        if(key  < root.data){
            return search(root.left,key);
        } else {
            return search(root.right, key);
        }
    }

    static boolean isValid(TreeNode root,int min,int max){
        if(root == null){
            return true;
        }

        if(root.data <= min || root.data >= max){
            return false;
        }

        boolean left = isValid(root.left, min, max);
        
        if(left){
            boolean right = isValid(root.right, min, max);
            return right;
        }
        return false;
    }
    public static void main(String[] args) {
        BinarySearchTree B1 = new BinarySearchTree();
        // B1.insertBST(5);        
        // B1.insertBST(6);
        // B1.insertBST(3);
        // B1.insertBST(1);
        // B1.insertBST(9);

        // B1.inOrder(B1.root);

        // if(B1.search(1) != null){
        //     System.out.println("Key Found");
        // } else {
        //     System.out.println("Key Not Found");
        // }

        if(isValid(B1.root, Integer.MIN_VALUE, Integer.MAX_VALUE) == true){
            System.out.println("Valid BST");
        } else {
            System.out.println("Not Valid BST");
        }
        

    }
}
