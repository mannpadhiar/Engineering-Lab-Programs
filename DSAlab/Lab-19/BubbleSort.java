public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {3,8,7,2,9,1,2};

        for(int i = arr.length; i>0 ;i--){
            for(int j=0; j<i-1; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}