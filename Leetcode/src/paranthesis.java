import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class paranthesis {

	public static boolean isValid(String s) {
		// my comments:
		// You are using a list as stack. There is already a satack avaialble in Java

		int i = 0;
		char[] list = new char[s.length()];
		int top = 0;

		while (i < s.length()) {

			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				list[top] = s.charAt(i);
				top++;
				i++;
			}

			else if (top > 0) {

				if (s.charAt(i) == ')') {

					if (list[top - 1] == '(') {
						top = top - 1;
						i++;
					} else
						return false;
				}

				else if (s.charAt(i) == ']') {

					if (list[top - 1] == '[') {
						top = top - 1;
						i++;
					} else
						return false;
				}

				else if (s.charAt(i) == '}') {

					if (list[top - 1] == '{') {
						top = top - 1;
						i++;
					} else
						return false;
				}
			} else
				return false;

		}

		if (top == 0)
			return true;
		else
			return false;

	}
	
	// my version of the same function. How do you compare it with yours ?
	public static boolean MyIsValid(String s) {
		// my comments:
		// You are using a list as stack. There is already a satack avaialble in Java

		int i = 0;
		Stack<Character> stack = new Stack<Character>();
		Map<Character, Character> brackets = new HashMap<Character, Character>() {{
			put('{', '}');
			put('(', ')');
			put('[', ']');			
		}}; 
		
		for (char ch: s.toCharArray()) {
			if (brackets.containsKey(ch))
				stack.push(ch);
			else if (!brackets.containsValue(ch) ||  stack.isEmpty() || stack.pop() != ch) 				
					return false;
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("()]"));
	}

}
