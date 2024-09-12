public class HeapSort{
    public void sort(int[] arr){
        int n = arr.length;
        for(int i = n/2 - 1; i>=0; i--){
            heapify(arr,n,i);
        }
        for(int i = n-1; i > 0 ;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, n, 0);
        }
    }

    public void heapify(int arr[],int n,int i){
        int largest = i;

        int l = 2*i + 1;
        int r = 2*i + 2; 

        if(i<n && arr[l] > arr[i])largest = l;
        if(i<n && arr[r] > arr[i])largest = r;

        if(i != largest){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}