package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class UtoLtoU {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Queue<String> q = new LinkedList<String>();
		for(int i = 0 ; i < str.length() ; i++) {
			String s = str.substring(i,i+1);
			char c = s.charAt(0);
			if(c >= 'a' && c <= 'z') {		
				q.offer(s.toUpperCase());
			}else if(c >= 'A' && c <= 'Z') {
				q.offer(s.toLowerCase());
			}
		}
		while(!q.isEmpty()) {
			System.out.print(q.poll());
		}
		
	}

}

//큐 자료구조 연습 겸 큐로 구현
