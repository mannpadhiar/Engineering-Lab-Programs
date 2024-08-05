public class LinerSearch{
    public static void main(String[] args) {
        int[] arr = {1,2,6,3,7};
        int x = 2;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                System.out.println("fonnd it!!!");
                return;
            }
        }
        System.out.println("not found!!!");
    }

}