import java.util.Scanner;

public class Avrage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your length :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        double sum=0;
        System.out.println("enter your numbers");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter your starting index :");
        int p = sc.nextInt();
        for(int j=0;j<p;j++){
            sum += arr[j];
        }
        System.out.println("avarage is : "+sum/n);
    }
}
