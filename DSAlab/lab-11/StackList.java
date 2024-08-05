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

        temp.link = first;
        first = temp;
    }

    public int pop(){
        if(first == null){
            System.out.println("your list is empty");
            return 0;
        }
        int n = first.data;
        first = first.link;
        
        return n;
    }

    public int peep(int index){
        Node temp = first;
        if(first == null){
            System.out.println("your list is empty");
            return -1;
        }

        int i = 1;
        for(i=1;i<index && temp.link != null;i++){
            temp = temp.link;
        }

        if(i != index){
            System.out.println("Index out of bound");
            return -1;
        }
       
        return temp.data;
    }

    public void display(){
        Node temp = first;

        Node prev = null;
        while(temp != null){
            Node frount = temp.link;
            temp.link = prev;
            prev = temp;
            temp = frount;
        }        
        temp = prev;
        while(temp != null){
            System.out.print(" -> "+temp.data);
            temp = temp.link;
        }
        
    }

}

public class StackList{
    public static void main(String[] args) {
        Link l1 = new Link();
        l1.push(1);
        l1.push(2);
        l1.push(3);
        l1.push(4);
        l1.push(5);

        l1.display();
        
    }
}