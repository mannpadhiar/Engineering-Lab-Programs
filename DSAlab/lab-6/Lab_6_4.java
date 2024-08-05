import java.util.Scanner;

public class Lab_6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         temprature t = new temprature();
         int n = sc.nextInt();
         if(n==1){
            t.cel_to_fel(n);
         } 
         else{
            t.fel_to_cel(n);
         }
         sc.close();
    }
}
class temprature{
public double cel_to_fel(double n){
    double temp  = n*(5/9)+32;
    return temp;
}
public double fel_to_cel(double n){
    double temp = (n-32)*(9/5);
    return temp;
}
}
