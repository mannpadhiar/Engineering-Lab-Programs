public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,3,6,8,9,10,17};
        int length = a.length;
        int low = 0;
        int high = length-1;
        int target = 17;

        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid] == target){
                System.out.println(mid);
                break;
            }
            else if(target > a[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
    }
}
