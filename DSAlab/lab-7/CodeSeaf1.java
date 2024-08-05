import java.util.*;
import java.util.Stack;
public class CodeSeaf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        Solution sol = new Solution();
        String ans = sol.removeStars(s);
        System.out.println(ans);
    }
}

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*')
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        String str = "";
        while (!stack.isEmpty()) {
            str += stack.pop() + "";
        }
        String ans = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ans += str.charAt(i) + "";
        }
        return ans;
    }
}