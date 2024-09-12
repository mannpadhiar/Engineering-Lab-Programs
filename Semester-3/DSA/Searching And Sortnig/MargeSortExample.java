import java.util.ArrayList;

public class MargeSortExample {
    public static void main(String[] args) {
        int arr[] = {1,3,7,5,4,8,7,9}; 
        InnerMargeSortExample ex = new InnerMargeSortExample();

        ex.margeSort(arr, 0, 7);

        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
}


class InnerMargeSortExample {
    public static void margeSort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        margeSort(arr, low, mid);
        margeSort(arr, mid+1, high);
        marge(arr, low, mid, high);
    }

    public static void marge(int[] arr,int low,int mid,int high){
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<Integer>();

        while(left <= mid && right <= high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        
    }
}