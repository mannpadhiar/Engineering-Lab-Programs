public class CirQueue {
    public static void main(String[] args) {
        temp CQ = new temp(5);
        CQ.enqueue(0);
        CQ.enqueue(1);
        CQ.enqueue(2);
        CQ.enqueue(3);
        CQ.enqueue(4);
        CQ.dequeue();
        CQ.enqueue(101);
        CQ.printData();

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
        if(end == length && start == 0){
            System.out.println("overflow"); 
            return;       
        }
        if(end+1 >= start){
            System.out.println("overflow");
            return;
        }
        if(start == -1 && end == -1){
            start = 0;
            end = 0;
        }
        end = end % length;
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
