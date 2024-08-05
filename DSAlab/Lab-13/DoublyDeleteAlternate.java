public class DoublyDeleteAlternate {
    public static void main(String[] args) {
        NodeMethods nm = new NodeMethods();
        
        nm.insertAtFirst(9);
        nm.insertAtFirst(8);
        nm.insertAtFirst(7);
        nm.insertAtFirst(6);
        nm.insertAtFirst(5);
        nm.insertAtFirst(4);
        nm.insertAtFirst(3);
        nm.insertAtFirst(2);
        nm.insertAtFirst(1);
        nm.insertAtFirst(0);
        
        
        nm.DeleteAlternate();
        nm.printData();
    }   


static class Node{
    int data;
    Node lptr;
    Node rptr;

    Node(int data){
        this.data = data;
        this.lptr = null;
        this.rptr = null;
    }
}

static Node head = null;
static Node tail = null;

static class NodeMethods{
    public static void insertAtFirst(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp;
            return;
        }
        temp.rptr =  head;
        head.lptr = temp;
        head = temp;
    }
    public static void DeleteAlternate(){
        if(head == null){
            System.out.println("your list is empty!!!!!!!!!!!!!");
            return;
        }

        Node temp = head;

        while(temp != null && temp.rptr != null){
            temp.rptr = temp.rptr.rptr;
            if(temp.rptr != null){
                temp.rptr.lptr = temp;
            }
            temp = temp.rptr;
        }
    }
    public static void printData(){
        Node temp = head;
        while(temp != null){
            System.out.print("-"+temp.data);
            temp = temp.rptr;
        }
    }
}
}