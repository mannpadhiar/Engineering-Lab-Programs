import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Stack;

public class CodeSeaf2 {
    

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t > 0){
            int n = sc.nextInt();
            String str = sc.next();

            Stack<Character> s = new Stack<>();
            String ans = "";
            for(int i = 0 ; i < str.length() ; i++){
                if("aeiou".indexOf(str.charAt(i)) > -1){
                    ans = "";
                    while(!s.isEmpty()){
                        ans += s.pop();
                    }
                    ans += str.charAt(i);
                    for(char c : ans.toCharArray()){
                        s.push(c);
                    }
                }
                else{
                    s.push(str.charAt(i));
                }
            }

            StringBuilder temp = new StringBuilder();
            while(!s.isEmpty() && "aeiou".indexOf(s.peek()) < 0){
                temp.append(s.pop());
            }

            ans += temp.reverse().toString();
            System.out.println(ans);
            t--;
        }

	}
}