public class BuildBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static int preIndex = 0;
    static int postIndex = 0;
    public static void main(String[] args) {
        int[] pre = {5,3,2,1,4,8,7};
        int[] post = {1,2,4,3,7,8,5};
        
        Node root = createTree(pre,post);
        inOrder(root);
    }

    public static Node createTree(int[] pre,int[] post){
        Node root = new Node(pre[preIndex++]);
        if(root.data != post[postIndex]){
            root.left = createTree(pre, post);
        }
        if(root.data != post[postIndex]){
            root.right = createTree(pre, post);
        }
        postIndex++;
        return root;
    }

    public static void inOrder(Node root){
        if(root == null)return;

        inOrder(root.left);
        System.out.print(root.data+"->");
        inOrder(root.right);
    }
}
