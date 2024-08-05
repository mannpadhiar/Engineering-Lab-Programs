import java.util.Scanner;

public class Lab_4_6 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1 = ");
        int size1 = sc.nextInt();

        System.out.println("Enter array = ");
        int a1[] = new int[size1];

        for (int i = 0; i < size1; i++) {
            a1[i] = sc.nextInt();
        }

        System.out.println("Enter size of array 2 = ");
        int size2 = sc.nextInt();

        System.out.println("Enter array = ");
        int a2[] = new int[size1];

        for (int i = 0; i < size1; i++) {
            a2[i] = sc.nextInt();
        }
        
        int total = size1 + size2;
        int t[] = new int[total];

        int j = 0;
        for(int i=0;i<total;i++){
            if(i<size1){
                t[i] = a1[i];
            }
            else{
                t[i] = a2[j];
                j++;
            }
        }
        for(int i=0;i<total;i++){
            System.out.println(t[i]);
        }
        sc.close();
    }
}
