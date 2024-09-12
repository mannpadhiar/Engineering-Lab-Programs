public class RadixSort{
    public static void main(String[] args) {
        int[] arr = {67,10,56,234};

        int max = getMax(arr, arr.length);

        for(int exp = 1; max/exp >0; exp *= 10){
            sort(arr,arr.length,exp);
        }

        print(arr, arr.length);
    }

    public static void sort(int[] arr,int n,int place){
        int count[] = new int[10];
        int output[] = new int[n];

        for(int i=0;i<10;i++){
            count[i] = 0;
        }

        for(int i=0;i<n;i++){
            count[(arr[i] / place) % 10]++;
        }

        for(int i=1;i<10;i++){
            count[i] += count[i-1];
        }

        for(int i=n-1;i>=0;i--){
            output[count[(arr[i]/place)%10]-1] = arr[i];
            count[(arr[i]/place)%10]--;
        }

        for(int i=0;i<n;i++){
            arr[i] = output[i];
        }
    }

    static int getMax(int arr[], int n){
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    static void print(int arr[], int n){
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}