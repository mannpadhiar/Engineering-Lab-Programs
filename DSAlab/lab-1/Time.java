import java.util.*;
public class Time{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();

        int hour=0;
        int minute=0;
        int second=0;

        while(sec > 60){
            if(sec > 60){
                minute++;
                sec-=60;
                if(minute > 60){
                    hour++;
                    minute-=60;
                }
                else{
                    minute++;
                }
            }else{
                sec++;
            }
            sec--;
        }
        System.out.println(hour+" "+minute+" "+sec);
    }
}