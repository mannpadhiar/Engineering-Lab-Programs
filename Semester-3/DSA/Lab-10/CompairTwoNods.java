public class CompairTwoNods {
    public static void main(String[] args) {
        
    }
}

class Node{
    int data;
    Node link;

    Node(int data){
        this.data = data;
        this.link = null;
    }
    
    Node First1 = null;
    Node First2 = null; 

    class EnterNode{
        Node newNode1 = new Node(data);
        Node newNode2 = new Node(data);

        public void insertAtFirst(int data){
            Node newNode = new Node(data);
            
            if(newNode1 == null || newNode2 == null){
            }
        }
    }
}
