import java.util.Stack;

public class ValidParentheses {

    Stack<Character> stack = new Stack<Character>();
    Character temp;

    public boolean isValid(String s) {
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    temp = stack.pop();
                    if (!temp.equals('(')) {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    temp = stack.pop();
                    if (!temp.equals('[')) {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    temp = stack.pop();
                    if (!temp.equals('{')) {
                        return false;
                    }
                    break;
            }
        }
        return (stack.isEmpty());
    }

    public boolean isValidSolution(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (
                    stack.isEmpty() &&
                            (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
            ) return false;
            else {
                if (!stack.isEmpty()) {
                    if (
                            stack.peek() == '(' && s.charAt(i) == ')'
                    ) stack.pop();
                    else if (
                            stack.peek() == '{' && s.charAt(i) == '}'
                    ) stack.pop();
                    else if (
                            stack.peek() == '[' && s.charAt(i) == ']'
                    ) stack.pop();
                    else stack.add(s.charAt(i));
                } else stack.add(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
