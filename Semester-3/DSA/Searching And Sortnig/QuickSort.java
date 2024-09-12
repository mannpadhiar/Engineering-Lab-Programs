public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,7,3,2,8,9,6};
        
        qsort(arr,0,6);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static int half(int[] arr,int low,int high){
        int i = low;
        int j = high;
        int pivot = low;

        while(i<j){
            while(arr[i] <= arr[pivot] && i<high){
                i++;
            }
            while(arr[j] > arr[pivot] && j>low){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;
    }

    public static void qsort(int[] arr,int low,int high){
        if(low < high){
            int pIndex = half(arr, low, high);
            qsort(arr, low, pIndex-1);
            qsort(arr, pIndex+1, high);
        }
    }

}
