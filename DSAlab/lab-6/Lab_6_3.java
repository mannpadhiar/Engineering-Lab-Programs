import java.util.Scanner;

public class Lab_6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1[] = new Student[2];

        for(int i=0;i<2;i++){
            s1[i] = new Student();
            sc.nextLine();
            System.out.println("Enter name -");
            s1[i].name = sc.nextLine();
            System.out.println("Enter cpi -");
            s1[i].cpi = sc.nextDouble();
            System.out.println("Enter enum -");
            s1[i].Enum = sc.nextInt();
            System.out.println("Enter sem -");
            s1[i].sem = sc.nextInt(); 
        }
        for(int i=0;i<2;i++){
           s1[i].print();
        }
        sc.close();

    }
}
class Student{
    String name;
    double cpi;
    int Enum;
    int sem;

    public void print(){
        System.out.println("name="+name);
        System.out.println("cpi="+cpi);
        System.out.println("Enrollment number="+Enum);
        System.out.println("sam="+sem);
    }
}
