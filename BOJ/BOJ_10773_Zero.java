package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero_BOJ10773 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K =Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<>();
		for(int i = 0 ; i < K ;i++) {
			int x = Integer.parseInt(br.readLine());
			if(x != 0) {
				s.push(x);
			}else {
				s.pop();
			}
		}
		int sum = 0 ;
		for(int x : s) {
			sum += x;
		}
		System.out.println(sum);
	}

}
