public class Nqueue{
    public static void main(String[] args) {
        temp Q = new temp(5);
        Q.enqueue(1);
        Q.enqueue(2);
        Q.enqueue(3);
        Q.enqueue(4);
        Q.enqueue(5);
        Q.enqueue(6);
        Q.enqueue(7);
        
        
        // Q.dequeue();
        // Q.dequeue();
        // Q.dequeue();
        // Q.dequeue();
        // Q.dequeue();

        Q.printData();
    }  
}


class temp{
    
    int[] arr;
    int length;
    int start = -1;
    int end = -1;

    temp(int n){
        this.start = -1;
        this.end = -1;
        this.length = n;
        arr = new int[n];
    }

    public void enqueue(int x){
        if(end >= length){
            System.out.println("overflow"); 
            return;       
        }
        if(start == -1 && end == -1){
            start = 0;
            end = 0;
        }
        arr[end] = x;
        end++;  
    }

    public int dequeue(){
        if(start == -1){
            System.out.println("underflow");
            return -1;
        }
        int y = arr[start];
        start++;
        return y;
    }

    public void printData(){
        for(int i=start;i<end;i++){
            System.out.println(arr[i]);
        }
    }
}