import java.util.ArrayList;
import java.util.Scanner;

public class Lab_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size = ");
        int size = sc.nextInt();

        System.out.println("Enter array = ");
        int a[] = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> mann = new ArrayList<Integer>();

        for(int i=0;i<a.length;i++){
            if(mann.contains(a[i])){
                continue;
            }
            else{
                mann.add(a[i]);
            }
        }
        for (int i = 0; i<=mann.size(); i++) {
            System.out.println(mann.get(i));
        }
        sc.close();
    }
}
