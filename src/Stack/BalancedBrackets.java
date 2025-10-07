package Stack;

public final class BalancedBrackets {
    private BalancedBrackets() {
    }

    static public boolean isBalancedBrackets(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (!stack.empty() && (
                    (stack.peek() == '(' && c == ')')
                            || (stack.peek() == '[' && c == ']')
                            || (stack.peek() == '{' && c == '}')
            )) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
