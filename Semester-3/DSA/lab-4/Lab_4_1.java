public class AccandingDelete {
    public static void main(String[] args) {
        int[]  arr = {1,1,5,5,5,0};
        int length = arr.length;
        int num = 2;
        for(int i=0;i<=length;i++){
            if(arr[i]>num){
               for(int j=i+1;j<length;j++){
                    arr[j] = arr[j-1];
               }
               arr[i] = num;
               break;
            }
        }
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
    }
}
