import java.util.*;
public class sum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       int sum=0;
       System.out.println("enter your starting index :");
       int p = sc.nextInt();
       System.out.println("enter your ending index : ");
       int q = sc.nextInt();
          for(int i=0;i<n;i++){
               arr[i] = sc.nextInt();
          }
       for(int j=p;j<q;j++){
            sum += arr[p];
       }
       System.out.println("your sum is "+sum);
    }
}
