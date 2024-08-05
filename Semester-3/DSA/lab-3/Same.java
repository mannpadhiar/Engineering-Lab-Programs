import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your length :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean flag = true;
        System.out.println("enter your array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();  
        }

        for(int j=0;j<n;j++){
            for(int k=1;k<n-1;k++){
                if(arr[j] == arr[k]){
                    flag = false;
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("there is same");
        }
        else{
            System.out.println("there is no same");
        }
    }
}
