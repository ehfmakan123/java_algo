package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bracket_BOJ9012 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
		int N = Integer.parseInt(br.readLine());
		for(int t = 0 ; t < N ; t++) {
			String str = br.readLine();
			Stack<Character> s = new Stack<>();
			String ans = "YES";
			for(char x : str.toCharArray()) {
				if(x == '(') {
					s.push(x);
				}else {
					if(s.isEmpty()) ans = "NO";
					else {
						s.pop();
					}
				}
			}
			if(!s.isEmpty()) {
				ans = "NO";
			}
			System.out.println(ans);
		}
	}

}
