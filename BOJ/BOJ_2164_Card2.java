package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Card2_BOJ2164 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 0 ; i < N ; i++) {
			q.offer(i+1);
		}
		while(q.size() > 1) {
			q.poll();
			q.offer(q.poll());
		}
		System.out.println(q.poll());
	}

}
