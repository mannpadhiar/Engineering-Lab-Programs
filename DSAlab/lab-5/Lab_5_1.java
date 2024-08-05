import java.util.Scanner;

public class Lab_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row = ");
        int r1 = sc.nextInt(); 
        System.out.println("Entner coloumn");
        int c1 = sc.nextInt();
        int m1[][] = new int[r1][c1];
        
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter row = ");
        int r2 = sc.nextInt(); 
        System.out.println("Entner coloumn");
        int c2 = sc.nextInt();
        int m2[][] = new int[r2][c2];
        int m3[][] = new int[r1][c1];

        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                m2[i][j] = sc.nextInt();
            }
        }
        if(r1 == r2 && c1 == c2){
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    m3[i][j] = m2[i][j] + m1[i][j]; 
                }
            }

            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                   System.out.println( m3[i][j]); 
                }
            }
        }
        else{
            System.out.println("Numbers of rows and column in not Equal bro.....");
        }
        sc.close();
    }
}
