public class Insert{
    public static void main(String[] args) {
        int[]  arr = {1,3,5,6,3};
        int[] temp = new int[6];
        int length = arr.length;
        int index = 3;
        int num = 8;

        for(int i=0;i<=length;i++){
            if(i<index){
                temp[i] = arr[i];
            }
            if(i == index){
                temp[i] = num;
            }
            if(i > index){
                temp[i] = arr[i-1];
            }
        }
        for(int i=0;i<=length;i++){
            System.out.println(temp[i]);
        }
    }
}