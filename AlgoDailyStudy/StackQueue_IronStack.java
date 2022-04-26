package StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class IronStick {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> s = new Stack<>();
		int res = 0 ;
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i)== '(') {
				s.push('(');
			}else { // 닫는 괄호 만나면 일단 pop
				s.pop();
				if(str.charAt(i-1) == '(') {
					res += s.size();
				}else {
					res++;
				}
			}
		}
		System.out.println(res);
	}

}

//풀었던 문제인데 기억이 잘 안났음;;
