class Solution {
	public boolean isBalanced(String s) {
		Stack<Character> stk = new Stack<>();
		
		stk.push(s.charAt(0));
		char top = stk.peek();
		for (int i = 1; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			if ((ch == '(') || (ch == '{') || (ch == '[')) {
				stk.push(ch);
			} else {
			    
			    if (!stk.empty()) {
				    top = stk.peek();
				    if ((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')) {
					    stk.pop();
				    } else return false;
			    } else {
			        return false;
			    }
		    }
		}
		return stk.empty();
	}
}