package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue2_BOJ18258 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		
		int T = Integer.parseInt(br.readLine());
		Deque<Integer> q = new LinkedList<Integer>();
		
		for(int t = 0 ;t < T ; t++) {
			st = new StringTokenizer(br.readLine());
			String key = st.nextToken();
			if(key.equals("push")) {
				q.offer(Integer.parseInt(st.nextToken()));
			}else if (key.equals("pop")){
				if(q.isEmpty()) {
					sb.append("-1"+"\n");
				}else {
					sb.append(q.poll()+"\n");
				}
			}else if(key.equals("size")) {
				sb.append(q.size()+"\n");
			}else if(key.equals("empty")) {
				if(q.isEmpty()) {
					sb.append("1"+"\n");
				}else {
					sb.append("0"+"\n");
				}
			}else if(key.equals("front")) {
				if(q.isEmpty()) {
					sb.append("-1"+"\n");
				}else {
					sb.append(q.peek()+"\n");
				}
			}else if(key.equals("back")) {
				if(q.isEmpty()) {
					sb.append("-1"+"\n");
				}else {
					sb.append(q.peekLast()+"\n");
				}
			}

			
		}

		System.out.println(sb.toString());
		
	}

}
