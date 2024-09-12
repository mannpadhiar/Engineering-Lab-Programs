import java.util.Stack;

class Node {
	int val;
	Node left;
	Node right;

	Node(int val) {
		this.val = val; 
	}
}

public class BSTIterator {
	public static void main(String[] args) {
		buildTree(5);
		buildTree(9);
		buildTree(2);
		buildTree(1);
		buildTree(8);

		inOrder(root);

		// System.out.println(search(root,5));
	}

	public static void inOrder(Node root){
        if(root == null)return;

        inOrder(root.left);
        System.out.print(root.val+"->");
        inOrder(root.right);
    }

	public static Node root = null;

	public static void buildTree(int val){
		Node newNode = new Node(val);

		if(root == null){
			root = newNode;
			return;
		}

		Node crr = root;

		while(true){
			// if(newNode.val == val)return;
			if(val < crr.val){
				if(crr.left == null){
					crr.left = newNode;
					return;
				}else
				crr = crr.left;
			}
			else{
				if(val > crr.val){
					if(crr.right == null){
						crr.right = newNode;
						return;
					}
					else
					crr = crr.right;
				}
			}
		}
	}

	// public static boolean search(Node root,int x){
	// 	if(root != null){
	// 		if(root.val < x){
	// 			search(root.right,x);
	// 		}
	// 		else if(root.val > x){
	// 			search(root.left,x);
	// 		}
	// 		else{
	// 			return true;
	// 		}
	// 	}
	// 	return false;
	// }
}
