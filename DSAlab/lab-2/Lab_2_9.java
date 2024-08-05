import java.util.Scanner;

public class Lab_2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(hours+":"+minutes+":"+remainingSeconds+":");
        sc.close();
    }
}
