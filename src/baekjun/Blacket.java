package baekjun;

import java.util.EmptyStackException;
import java.util.Stack;

public class Blacket {
	public static void main(String[] args) {
		String n = "()()(())()";
		System.out.println(solution(n));
	}
	public static String solution(String n) {
		String answer = "";
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i<n.length();i++) {
			if(n.charAt(i) == '(') {
			stack.add(n.charAt(i));
			}else if(n.charAt(i) == ')'){
				try{
					stack.pop();
				}catch(EmptyStackException e) {
					return "NO";
				}
			}	
		}
		if(stack.size() == 0) {
			return "YES";
		}else {
			return "NO";
		}
		
	}
}
