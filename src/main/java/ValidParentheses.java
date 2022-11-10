import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> leftBracket = new Stack<>();
        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                leftBracket.push(bracket);
            } else if (bracket == ')' && !leftBracket.isEmpty() && leftBracket.peek() == '(') {
                leftBracket.pop();
            } else if (bracket == '}' && !leftBracket.isEmpty() && leftBracket.peek() == '{') {
                leftBracket.pop();
            } else if (bracket == ']' && !leftBracket.isEmpty() && leftBracket.peek() == '[') {
                leftBracket.pop();
            } else {
                return false;
            }
        }
        return leftBracket.isEmpty();
    }
}
