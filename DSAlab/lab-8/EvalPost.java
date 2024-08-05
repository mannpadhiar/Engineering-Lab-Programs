import java.util.Stack;
public class EvalPost {
    public static void main(String[] args) {
        Eval e = new Eval();
        e.Answer("22*44*+4/");
    }
}

class Eval{
    public void Answer(String s){
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                stack.push((int)(s.charAt(i)));
            }
            else{
                int v2 = (int)(stack.pop());
                int v1 = (int)(stack.pop());

                switch (s.charAt(i)) {
                    case '+': stack.push(v1+v2);
                    break;
                    case '-': stack.push(((v1-v2)>0)?(v1-v2):(v2-v1));
                    break;
                    case '*': stack.push(v1*v2);
                    break;
                    case '/': stack.push(((v1-v2)>0)?(v1/v2):(v2/v1));
                    break;
                }
            }
        }
        System.out.println(stack.pop());
    }
}