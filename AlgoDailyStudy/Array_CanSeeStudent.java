package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class CanSeeStudent {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = 0 ;
		for(int i = 0 ; i< N ; i++) {
			int x = Integer.parseInt(st.nextToken());
			if(x > max) {
				max = x;
				s.push(x);
			}
		}
		System.out.println(s.size());
	}
}


