import java.util.Stack;
public class infixToPostfix {
    public static void main(String[] args) {
        String s = "a+b*c-d/e)";
        Stack<Character> stack = new Stack<>();
        String post = "";  

        Method m = new Method();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(stack.size() == 0)stack.push('(');
            if(Character.isAlphabetic(s.charAt(i)))post+=c;
            else if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/'){
                while(!stack.empty() && m.cheakPrisidence(stack.peek()) < m.cheakPrisidence(c) && stack.peek() != '('){
                    post += stack.pop();
                }
                stack.push(c);
            }
            else{
                while(stack.peek() != '('){
                    post += stack.pop();
                }
                stack.pop();
            }
        }
        System.out.println(post);
    }
}

class Method{
    public int cheakPrisidence(char c){
        if(c == '+' || c == '-')return 1;
        else if(c == '*' || c == '/')return 2;
        else if(c == '^')return 3;
        return -1;
    }
}