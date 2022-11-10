import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        int token1;
        int token2;
        Stack<Integer> stack = new Stack<>();
        for (String elem : tokens) {
            if (elem.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (elem.equals("-")) {
                token2 = stack.pop();
                token1 = stack.pop();
                stack.push(token1 - token2);
            } else if (elem.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (elem.equals("/")) {
                token2 = stack.pop();
                token1 = stack.pop();
                stack.push(token1 / token2);
            } else {
                stack.push(Integer.parseInt(elem));
            }
        }
        return stack.pop();
    }
}