package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedWorld_BOJ4949 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str ;
		
		while(true) {
			
			str = br.readLine();
			
			if(str.equals(".")) {
				break;
			}
			sb.append(solve(str)).append('\n');
		}
		
		System.out.println(sb.toString());
		br.close();
	}

	private static String solve(String str) {
		
		Stack<Character> s =  new Stack<>();
		
		for(char x : str.toCharArray()) {
			
			if(x == '(' || x =='[') {
				
				s.push(x);
			}
			
			else if(x == ')'){
				
				if(s.isEmpty() || s.peek() != '(') {
					return "no";
					
				}else {
					
					s.pop();
				}
				
			}else if(x == ']') {
				
				if(s.isEmpty() || s.peek() != '[') {
					
					return "no";
					
				}else {
					
					s.pop();
					
				}
			}
		}
		
		if(s.isEmpty()) {
			return "yes";
		}else {
			return "no";
		}
	}
}
