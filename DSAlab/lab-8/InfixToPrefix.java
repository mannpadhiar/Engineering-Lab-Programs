import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        StringBuilder infix = new StringBuilder("(a+b*c/d-e+f/g/(h+i))");
        int rank = 0;
        StringBuilder ans = new StringBuilder();
        infix.reverse();
        
        for (int i = 0; i < infix.length(); i++) {
            if (infix.charAt(i) == '(') {
                infix.setCharAt(i, ')');
            } else if (infix.charAt(i) == ')') {
                infix.setCharAt(i, '(');
            }
        }
        
        for(int i = 0; i<infix.length(); i++){
            if(infix.charAt(i) == '('){
                st.push('(');
            }
            else if(Character.isAlphabetic(infix.charAt(i))){
                ans.append(infix.charAt(i));
                rank++;
            }
            else if(infix.charAt(i) == '+' || infix.charAt(i) == '*' || infix.charAt(i) == '/' || infix.charAt(i) == '-' || infix.charAt(i) == '^'){
                while (!st.isEmpty() && st.peek() != '(' && precidence(st.peek()) > precidence(infix.charAt(i))) {
                    ans.append(st.pop());
                    rank--;
                }
                st.push(infix.charAt(i));
            }
            else{
                while(st.peek() != '('){
                    ans.append(st.pop());
                    rank--;
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
            }

        }
        while (!st.isEmpty()) {
            ans.append(st.pop());
            rank--;
        }
        System.out.println(ans.reverse());
        System.out.println("Rank = " + rank);
    }   
    
    public static int precidence(char ch){
        switch (ch) {
            case '+':
            case '-':
                return 1;
                
            case '*':
            case '/':
                return 2;
        
            case '^':
                return 3;
        } 
        return -1;

    }
}