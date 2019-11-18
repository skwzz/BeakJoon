package leetcode;

import java.util.Stack;

public class Leet20_ValidParentheses {
	public static void main(String[] args) {
		String str = "()";
//		String str = "()[]{}";
//		String str = "(]";
//		String str = "([)]";
//		String str = "{[]}";
		
		boolean answer = isValid(str);
		System.out.println(answer);
	}
	
	public static boolean isValid(String str) {
		boolean ret = true;
		char[] arr = str.toCharArray();
		Stack<Character> s = new Stack<>();
		
		for(int i=0; i<arr.length; i++) {
			char c = arr[i];
			if(c=='(' || c=='[' || c=='{') {
				s.push(c);
			}else {
				//close bracket일 때
				if(s.isEmpty()) {
					// 비어있을떄
					ret = false;
					break;
				}
				
				
				if(c==')' && (s.peek()=='(')){
					s.pop();
				}else if(c==']' && (s.peek()=='[')){
					s.pop();
				}else if(c=='}' && (s.peek()=='{')){
					s.pop();
				}else { // 브라켓 매칭이 안될경우
					ret = false;
					break;
				}
			}
		}
		
		return ret;
	}
}
