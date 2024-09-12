<<<<<<< HEAD
public class BInaryTreeExample {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        BinaryTree b = new BinaryTree();
        Node root = b.builtTree(arr,0);
        b.preOrder(root);
        System.out.println();
        b.postOrder(root);
        System.out.println();
        b.inOrder(root);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {

    public Node builtTree(int[] arr , int idx) {

        if (idx >= arr.length) {
            return null;
        }

        Node newNode = new Node(arr[idx]);
        newNode.left = builtTree(arr,idx*2+1);
        newNode.right = builtTree(arr,idx*2+2);

        return newNode;
    }

    public void preOrder(Node root){
        if(root == null)return;

        System.out.print(root.data+"");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root){
        if(root == null)return;

        preOrder(root.left);
        System.out.print(root.data+"");
        preOrder(root.right);
    }

    public void postOrder(Node root){
        if(root == null)return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+"");
    }
}
=======
public class BInaryTreeExample {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        BinaryTree b = new BinaryTree();
        Node root = b.builtTree(arr,0);
        b.preOrder(root);
        System.out.println();
        b.postOrder(root);
        System.out.println();
        b.inOrder(root);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {

    public Node builtTree(int[] arr , int idx) {

        if (idx >= arr.length) {
            return null;
        }

        Node newNode = new Node(arr[idx]);
        newNode.left = builtTree(arr,idx*2+1);
        newNode.right = builtTree(arr,idx*2+2);

        return newNode;
    }

    public void preOrder(Node root){
        if(root == null)return;

        System.out.print(root.data+"");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root){
        if(root == null)return;

        preOrder(root.left);
        System.out.print(root.data+"");
        preOrder(root.right);
    }

    public void postOrder(Node root){
        if(root == null)return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+"");
    }
}
>>>>>>> fd7722fd0c53ee58bb6021000d131d2338bb0574
