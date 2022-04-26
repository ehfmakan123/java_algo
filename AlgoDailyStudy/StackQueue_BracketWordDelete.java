package StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BracketWordDelete {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> s = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x == '(') {
				s.push(x);
			}else if(x == ')') {
				s.pop();
			}else if(Character.isAlphabetic(x) && s.isEmpty()) {
				System.out.print(x);
			}
		}
	}	

}
