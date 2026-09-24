public class BinaryTree {

    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
        }
    }

   
    static TreeNode insert(TreeNode root, int data) {

        if (root == null) {
            return new TreeNode(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } 
        else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    
    static boolean search(TreeNode root, int value) {

        if (root == null) {
            return false;
        }

        if (root.data == value) {
            return true;
        }

        if (value < root.data) {
            return search(root.left, value);
        } 
        else {
            return search(root.right, value);
        }
    }

    public static void main(String[] args) {

        TreeNode root = null;

        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 20);
        root = insert(root, 15);
        root = insert(root, 7);
        root = insert(root, 2);
        root = insert(root, 30);

        System.out.println(root.data);
        System.out.println( root.left.data);
        System.out.println( root.right.data);
       // System.out.println("Search 7: " + search(root, 7));
      //  System.out.println("Search 20: " + search(root, 20));
    }
}