public class BubbleShort{
    public static void main(String[] args) {
        
        int a[] = {12,3,4,6,67,43};
        int length = a.length;

        for(int i=length;i>=0;i--){
            for(int j=0;j<i-1;j++){
                if(a[j+1]>a[j]){
                    int temp;
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }

        for(int i=0;i<length;i++){
            System.out.println(a[i]);
        }
    }
}