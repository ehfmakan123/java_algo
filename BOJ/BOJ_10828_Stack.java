package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack_BOJ10828 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<>();
		for(int t = 0 ; t < N ;t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			if(str.equals("push")) {
				s.push(Integer.parseInt(st.nextToken()));
			}else {
				if(str.equals("top")) {
					if(!s.isEmpty()) {
						System.out.println(s.peek());
					}else {
						System.out.println("-1");
					}
				}else if(str.equals("pop")) {
					if(!s.isEmpty()) {
						System.out.println(s.pop());
					}else {
						System.out.println("-1");
					}
				}else if(str.equals("size")) {
					System.out.println(s.size());
				}else if(str.equals("empty")) {
					if(s.isEmpty()) {
						System.out.println("1");
					}else {
						System.out.println("0");
					}
				}
			}
		}
	}
}
