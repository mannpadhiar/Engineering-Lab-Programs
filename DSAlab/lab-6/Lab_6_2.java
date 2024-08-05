import java.util.Scanner;

public class Lab_6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee_details ed = new Employee_details();

        System.out.println("Enter id = ");
        ed.id = sc.nextInt();

        System.out.println("Enter name = ");
        ed.name = sc.nextLine();
        sc.nextLine();
        
        System.out.println("Enter salary = ");
        ed.salary = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter designation = ");
        ed.designation = sc.nextLine();
        sc.close();
        ed.print_details();
    }
}
class Employee_details{
    int id;
    int salary;
    String name;
    String designation;

    public void print_details(){

        System.out.println("id="+id);
        System.out.println("name ="+name);
        System.out.println("salary="+salary);
        System.out.println("desigination="+designation);

    }
}