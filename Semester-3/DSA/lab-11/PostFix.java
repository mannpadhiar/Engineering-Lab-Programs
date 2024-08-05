import java.util.Stack;

public class PostFix {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String post = "a+b*c/d-e+f/g/(h+i)";
        String s = "";

        for(int i=0;i<post.length();i++){
            if(post.charAt(i) == '('){
                stack.push('(');
            }
            int ascii = (int)post.charAt(i);            
            if(ascii >= 48 && ascii<=57)s += (ascii-48);
            else if(post.charAt(i) == '+' || post.charAt(i) == '-' || post.charAt(i) == '*' || post.charAt(i) == '/'){
                if(){
                    
                }
            }
        }
    }
    public static int cheakPricidence(char peek){
        if(peek == '+' && peek == '-')return 1;
        else if(peek == '*' && peek == '/')return 2;
        else if(peek == '^')return 3;
        return 0;
    }
}
