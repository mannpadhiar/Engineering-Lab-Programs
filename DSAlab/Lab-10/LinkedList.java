class Node{
    int data;
    Node link;

    Node(int data){
        this.data = data;
        this.link = null;
    }
}

class Link{
    Node first = null;
    public void insertAtFirst(int data){
        Node temp = new Node(data);
        
        temp.link = first; 
        first = temp;
    }

    public void insertAtlast(int data){
        Node temp = new Node(data);

        if(first == null){
            first = temp;
            return;
        }
        else{
            Node a = first;
            while(a.link != null){
                a = a.link;
            }
            a.link = temp;
        }

    }

    public void DeleteAtFirst(){
        if(first == null){
            System.out.println("your list is empty");
            return;
        }
        else{
            first = first.link;
        }
    }

    public void DeleteAtLast(){
        if(first == null){
            System.out.println("your list is empty");
        }
        else{
            Node temp = first;
            while(temp.link.link != null){ 
                temp = temp.link;
            }
            temp.link = null;
        }
    }

    public void delete(int x){
        Node temp = first;
        if(temp == null){
            System.out.println("your list is null");
            return;
        }
        if(temp.data == x){
            DeleteAtFirst();
            return;
        }
        while(temp.link != null && temp.link.data != x){
            temp = temp.link;
        }
    
        temp.link = temp.link.link;
    }

    public void display(){
        int count = 0;
        Node temp = first;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.link;
        }
    }
}

public class LinkedList{
    public static void main(String[] args) {
        Link ll = new Link();
        ll.insertAtFirst(2);
        ll.insertAtFirst(0);
        ll.insertAtlast(71);
        // ll.DeleteAtFirst();
        // ll.DeleteAtLast();
        ll.delete(0);
        ll.display();
    }
}