package StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class CorrectBracket {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> s = new Stack<>();
		String res = "YES";
		
		for(char x : str.toCharArray()) {
			if(x=='(') s.push(x);
			else {
				if(s.isEmpty()) { // 중간에 스택이 비면 NO를 출력하고 break;
					res = "NO";
					break;
				}
				s.pop();
			} 
		}
		if(!s.isEmpty()) {
			res = "NO";
		}
		
		System.out.println(res);
	}

}
