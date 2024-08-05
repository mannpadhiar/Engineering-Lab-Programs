import java.util.Scanner;

public class Lab_6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number.....");
        int a = sc.nextInt();
        System.out.println("Enter second number.....");
        int b = sc.nextInt();
        swap(a,b);
        sc.close();
    }
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("first number = "+a);
        System.out.println("second number = "+b);
    }
}
