package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Josephus0_BOJ11866 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N =Integer.parseInt(st.nextToken());
		int K =Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i = 0 ; i < N ;i++) {
			q.offer(i+1);
		}
		sb.append("<");
		
		while(!q.isEmpty()) {
			for(int i = 0 ; i < K-1 ; i++) {
				q.offer(q.poll());
			}
			sb.append(q.poll()+", ");
		}
		sb.setLength(sb.length()-2); // sb.append 하던거 마지막에 꼬리 잘라주기
		sb.append(">");
		System.out.println(sb.toString());
		br.close();
	}

}
