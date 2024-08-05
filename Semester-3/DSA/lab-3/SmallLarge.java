import java.util.*;
class SmallLarge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int minIndex = 0;
        int maxIndex = 0;
        for(int j=0;j<n;j++){
            if(arr[minIndex]>arr[j]){
                minIndex = j;
            }
            else if(arr[maxIndex]<arr[j]){
                maxIndex = j;
            }
        }
        
        System.out.println(maxIndex);
        System.out.println(minIndex);
    }
}