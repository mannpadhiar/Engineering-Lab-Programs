public class CountNodes {
    public static void main(String[] args) {
        System.out.println("ksjgfij");
        Count c = new Count();
        c.insertAtFirst(0);
        c.insertAtFirst(3);
        c.insertAtFirst(4);
        c.countt();
    }
}

class Node{
    int data;
    Node link;

    Node(int data){
        this.data = data;
        this.link = null;
    }
}

class Count{
    Node first = null;
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
            return;
        }
        newNode.link = first;
        first = newNode;
    }

    public void countt(){
        int count = 1;
        Node temp = first;
        while(temp != null){
            temp.link = temp;
            count++;
        }
        System.out.println(count);
    }
}