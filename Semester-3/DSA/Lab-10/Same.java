public class Same{
    static class Node{
        int data;
        Node link;

        Node(int data){
            this.data = data;
            this.link = null;
        }
    }

    static class LinkList{
        
        public static Node first;

        public void insertAtFirst(int data){
            Node temp = new Node(data);
            
            temp.link = first; 
            first = temp;
        }

        public void sameOrNot(LinkList l1,LinkList l2){
            Node temp1 = l1.first;
            Node temp2 = l2.first;

            while(temp1 != null && temp2 != null){
                if(temp1.data != temp2.data){
                    System.out.println("Not same");
                    return;
                }
                temp1 = temp1.link;
                temp2 = temp2.link;
                

            }
            if(temp1 != null || temp2 != null){
                System.out.println("Not same!!!!!!!!!!!");
                return;
            }
            System.out.println("Same!!!!");
        } 
    }

    public static void main(String[] args) {
        LinkList l1 = new LinkList();
        l1.insertAtFirst(1);
        l1.insertAtFirst(2);
        l1.insertAtFirst(4);
        l1.insertAtFirst(2);

        LinkList l2 = new LinkList();
        l2.insertAtFirst(1);
        l2.insertAtFirst(2);
        l2.insertAtFirst(4);
        l2.insertAtFirst(2);

        l1.sameOrNot(l1, l2);
    }
}
