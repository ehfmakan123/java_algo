package StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostFix {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Integer> s = new Stack<>();
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				s.push(x-'0');
			}else {
				int rt = s.pop();
				int lt = s.pop();
				if(x == '+') s.push(rt+lt);
				else if(x == '-') s.push(lt-rt);
				else if(x =='*') s.push(rt*lt);
				else if(x == '/') s.push(lt/rt);
			}
		}
		System.out.println(s.get(0));
	}

}
