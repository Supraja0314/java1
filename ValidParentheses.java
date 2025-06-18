import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // Push opening brackets
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // All brackets matched
    }

    public static void main(String[] args) {
        String input1 = "()[]{}";
        String input2 = "([)]";
        String input3 = "{[()]}";

        System.out.println(isValid(input1)); // true
        System.out.println(isValid(input2)); // false
        System.out.println(isValid(input3)); // true
    }
}
