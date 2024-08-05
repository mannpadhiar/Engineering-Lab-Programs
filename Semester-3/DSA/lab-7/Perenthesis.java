import java.util.Stack;

public class Perenthesis {
    public static void main(String[] args) {
        int T = 4;
        String[] testCases = {
            "()",
            "([)]",
            "([{}()])[{}]",
            "[{{}]"
        };
        for(int i=0;i<T;i++){
        String input = testCases[i];
        if(Process(input)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        }
    }
    public static boolean Process(String s){
        Stack<Character> s1 = new Stack<>();
        for(char ch :s.toCharArray()){
            if(ch =='(' || ch =='{' || ch =='['){
                s1.push(ch);
            }
            else if(ch ==')' || ch =='}' || ch ==']'){
                if(s1.isEmpty()){
                    return false;
                }
                char top = s1.pop();
                if (!check(top, ch)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean check(char top,char ch){
        return ((top =='(' && ch == ')') || (top =='{' && ch == '}') || (top =='[' && ch == ']'));
    }
}