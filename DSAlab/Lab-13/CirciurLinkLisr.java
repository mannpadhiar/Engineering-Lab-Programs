public class CirciurLinkLisr {
    public static void main(String[] args) {
        Innerlink cl = new Innerlink();
        cl.insertAtStart(2);
        cl.insertAtEnd(3);
        cl.insertAtStart(1);
        cl.insertAtEnd(4);
        cl.deleteAtIndex(2);
        // cl.deleteAtFirst();
        // cl.deleteAtLast();
        cl.display();
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
    public void insertAtEnd(int data){
        Node temp = new Node(data);
        if(first == null){
            first = temp;
            first.next = first;
            last = temp;
        }
        else{
            temp.next = last.next;
            last.next = temp;
        }
        last = temp;
    }

    public void deleteAtFirst(){
        if(first == last){
            System.out.println("your list is empty");
            first = null;
            last = null;
        }
        if(first == null){
            System.out.println("your list is empty");
        }
        else{
            first = first.next;
            last.next = first;
        }
    }

    public void deleteAtLast(){
        if(first == last){
            System.out.println("your list is empty");
            first = null;
            last = null;
            return;
        }
        if(first == null){
            System.out.println("your lisdt is empty!!!!");
        }
        else{
            Node temp = first;
            while(temp.next.next != first){
                temp = temp.next;
            }
            temp.next = first;
        }
    }

    public void deleteAtIndex(int x){
        Node temp = first;
        if(temp == null){
            System.out.println("your list is null");
            return;
        }
        if(first.data == x){
            deleteAtFirst();
            return;
        }
        if(last.data == x){
            deleteAtLast();
            return;
        }
        while(temp.next != first && temp.next.data != x ){
            temp = temp.next;
        }
        if(temp.next == first){
            System.out.println("your list does not have this element!!!!!!!");
        }
        temp.next = temp.next.next;
    }

    public void display(){
        Node temp = first;
        if(first == null){
            System.out.println("your list is empty!");
            return;
        }
        do{
            System.out.println(temp.data);
            temp = temp.next;
        }
        while(temp != first);
    }
}