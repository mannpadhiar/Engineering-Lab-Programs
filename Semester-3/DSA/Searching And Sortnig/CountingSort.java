public class CountingSort {
    public static void main(String[] args) {
        int[] inputArray = {4, 3, 12, 1, 5, 5, 3, 9};
        int[] outputArray = countSort(inputArray);

        for(int i=0;i<outputArray.length;i++){
            System.out.println(outputArray[i]);
        }
    }

    public static int[] countSort(int[] inputArray){
        int n = inputArray.length;
        int m = 0;

        for(int i=0;i<n;i++){
            m = Math.max(m,inputArray[i]);
        }
        int[] countArray = new int[m+1];

        for(int i=0;i<n;i++){
            countArray[inputArray[i]]++;
        }

        for(int i=1;i<=m;i++){
            countArray[i] = countArray[i] + countArray[i-1];
        }

        int[] outputArray = new int[n];

        for(int i = n-1;i>=0;i--){
            outputArray[countArray[inputArray[i]]-1] = inputArray[i];
            countArray[inputArray[i]]--;
        }

        return outputArray;
    }
}
