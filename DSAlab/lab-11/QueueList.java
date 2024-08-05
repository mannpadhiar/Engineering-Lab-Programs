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
    
    public void push(int data){
        Node temp = new Node(data);

        if(first == null){
            first = temp;
            return;
        }
        
        Node a = first;
        while(a.link != null){
            a = a.link;
        }
        a.link = temp;
    }

    public void remove(){
        if(first == null){
            System.out.println("your list is empty");
            return;
        }
        else{
            first = first.link;
        }
    }

    public void display(){
        Node temp = first;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.link;
        }
    }
}

public class QueueList{
    public static void main(String[] args) {
        Link l1 = new Link();

        l1.push(2);
        l1.push(3);
        l1.push(5);
        l1.remove();
        l1.display();
    }
}