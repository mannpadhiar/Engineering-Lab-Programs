import java.util.*;
public class BinaryTreeExe{
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        
        static int idx = -1;

        public static Node builtTree(int[] nodes){
            idx++;

            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = builtTree(nodes);
            newNode.right = builtTree(nodes);
            
            return newNode;
        }

        public static void preorder(Node root){
            if(root == null)return;

            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root == null)return;

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root == null)return;

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root){
            if(root == null){
                System.out.println("you dont have tree");
            }
            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data);
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }

        }

        public static int countNode(Node root){
            if(root == null){
                return 0;
            }
            int leftCount = countNode(root.left);
            int rightCount = countNode(root.right);

            return leftCount + rightCount + 1;
        }

        public static int sumNodeData(Node root){
            if(root == null)return 0;

            int leftSum = sumNodeData(root.left);
            int rightSum = sumNodeData(root.right);

            return leftSum + rightSum + root.data;
        }

        public static int heightOfTree(Node root){
            if(root == null)return 0;

            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);

            int mainHeight = Math.max(leftHeight,rightHeight) +1;
            return mainHeight;
        }

        public int diameater(Node root){
            if(root == null)return 0;

            int leftDiameter = diameater(root.left);
            int rightDiameater = diameater(root.right);
            int diameater3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

            return Math.max(Math.max(leftDiameter,rightDiameater),diameater3);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree b1 = new BinaryTree();
        Node root = b1.builtTree(arr);
        b1.preorder(root);

        System.out.println();
        b1.inorder(root);

        System.out.println();
        b1.postorder(root);

        System.out.println();
        b1.levelOrder(root);

        System.out.println("total nodes are " + b1.countNode(root));
        System.out.println("sum of nodes are " + b1.sumNodeData(root));
        System.out.println("height of tree " + b1.heightOfTree(root));
        System.out.println("diameter of tree " + b1.diameater(root));
    }
}