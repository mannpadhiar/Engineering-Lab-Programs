public class DoubleyLinkList {
    public static void main(String[] args) {
        NodeMethods n = new NodeMethods();
        n.insertAtFirst(0);
        n.insertAtFirst(9);
        n.insertAtFirst(6);
        n.insertAtFirst(2);
        n.insertAtFirst(4);
        n.insertAtFirst(1);
        n.DeleteAtLast();
        n.DeleteAtIndex(2);
        n.printData();
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

        public static void insertAtlast(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                tail = temp;
            }
            temp.lptr = tail;
            tail.rptr = temp;
            tail = temp;
        }

        public static void DeleteAtFirst(){
            Node temp = head;
            if(temp == null){
                System.out.println("Your list is empty");
                return;
            }
            temp = temp.lptr;
            temp.rptr = null;
            head = temp;
        }

        public static void DeleteAtLast(){
            Node temp = head;
            if(temp == null){
                System.out.println("Your list is empty!!!");
                return;
            }
            while(temp.rptr.rptr != null){
                temp = temp.rptr;
            }
            temp.rptr = null;
            tail = temp; 
        }

        public static void DeleteAtIndex(int k){
            Node temp = head;
            if(temp == head){
                System.out.println("your list is empty");
                return;
            }
            for(int i=0;i<k;i++){
                temp = temp.rptr;
            }
            temp.lptr.rptr = temp.rptr;
            temp.rptr.lptr = temp.lptr;
        }

        public static void printData(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.rptr;
            }
        }
    }
}
