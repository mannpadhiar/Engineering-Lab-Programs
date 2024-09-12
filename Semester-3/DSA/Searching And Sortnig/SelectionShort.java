
public class SelectionShort {
    public static void main(String[] args) {

        int a[] = {2,3,9,6,5,12,6,8};
        for(int i=0;i<a.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<a.length;j++){
                if(a[smallest] > a[j]){
                    smallest = j;
                }
            }
            int temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;
        }
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }
    }
}
