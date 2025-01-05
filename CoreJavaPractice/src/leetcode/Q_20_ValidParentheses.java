package leetcode;
import java.util.Stack;

//20. Valid Parentheses
public class Q_20_ValidParentheses {

	public static void main(String[] args) {

		String str = "[{()[]}()]";
		System.out.println("is valid parentheses: "+ isValid(str));
	}
		
	public static boolean isValid(String str) {

		Stack<Character> stack = new Stack<Character>();

		for (char ch : str.toCharArray()) {

			if (ch == '[') {
				stack.push(']'); // it pushes the corresponding closing bracket (), }, ]) onto the stack.
			} else if (ch == '(') {
				stack.push(')');
			} else if (ch == '{') {
				stack.push('}');
			} else if (stack.isEmpty() || stack.pop() != ch) {
				return false;
			}
		}
		return stack.empty();
	}

}
