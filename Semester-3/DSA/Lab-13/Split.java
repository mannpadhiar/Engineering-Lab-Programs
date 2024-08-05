public class Split {
    public static void main(String[] args) {
        Innerlink nl = new Innerlink();

        nl.insertAtStart(5);
        nl.insertAtStart(4);
        nl.insertAtStart(3);
        nl.insertAtStart(2);
        nl.insertAtStart(1);
        nl.insertAtStart(0);

        nl.splitInHalf();
    }
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }

}
    
    class Innerlink{
        Node first = null;
        Node last = null;
        public void insertAtStart(int data){
            Node temp = new Node(data);
            if(first == null){
                first = temp;
                first.next = temp;
                last = temp;
            }
            else{
                temp.next = first;
                last.next = temp;
            }        
            first = temp;
        }
        public void splitInHalf(){
            Node fast = first;
            Node slow = first;
            Node newHead = first;

            if(first == null){
                System.out.println("your list is empty");
            }

            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            
            newHead = slow.next;
            slow.next = null;
        }
    }

