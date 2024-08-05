public class Delete {
    public static void main(String[] args) {
        int[]  arr = {1,3,5,6,3};
       
        int length = arr.length;
        int loc = 3;

        for(int i= loc;i<length-1;i++){
        
            arr[i] = arr[i+1];

        }
        for(int i=0;i<length-1;i++){
            System.out.println(arr[i]);
        }
    }
}
