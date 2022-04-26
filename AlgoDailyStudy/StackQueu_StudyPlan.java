package StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class StudyPlan {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String str2 = br.readLine();
		String ans = "YES";
		Queue<Character> q = new LinkedList<Character>();
		for( char x : str.toCharArray()) {
			q.offer(x);
		}
		for(char x : str2.toCharArray()) {
			if(q.contains(x)) {
				if(x != q.poll()) ans = "NO";
			}
		}
		if(!q.isEmpty()) {
			ans = "NO";
		}
		System.out.println(ans);
	}
	
}
