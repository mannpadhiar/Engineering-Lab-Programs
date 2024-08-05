public class CopyLinkList {
    public static void main(String[] args) {
        SLinkList s = new SLinkList();
        s.insertAtStart(2);
        s.insertAtStart(3);
        s.insertAtStart(4);
        s.insertAtStart(5);
        s.insertAtStart(6);
        s.copy();
        s.display();
    }
    
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public Node first = null;
public Node begin = null;

class SLinkList {

    void insertAtStart(int data) {
        Node temp = new Node(data);

        if (first == null) {
            first = temp;
        } else {
            temp.next = first;
        }
        first = temp;
    }

    void copy() {
        if (first == null) {
            System.out.println("List is empty!!!!");
        }
        Node save = first;
        Node pred = begin;
        while (save != null) {
            Node newNode = null;
            pred.data = save.data;
            pred.next = newNode;
            save = save.next;
            pred = pred.next;
        }
    }

    void display() {
        Node temp1 = first;
        Node temp2 = begin;
        while (temp1 != null) {
            System.out.println(temp1.data);
            temp1 = temp1.next;
            System.out.println(temp2.data);
            temp2 = temp2.next;
        }
    }

}
