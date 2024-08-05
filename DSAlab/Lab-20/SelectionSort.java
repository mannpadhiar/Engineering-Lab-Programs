public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {3,1,8,6,3,1};
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] < arr[smallest]){
                    int temp = arr[j];
                    arr[j] = arr[smallest];
                    arr[smallest] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}