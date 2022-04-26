package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue_BOJ10845 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder() ;
		int key = 0;
		for(int t = 0 ; t < N ;t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			switch (str) {
			case "push":
				key = Integer.parseInt(st.nextToken());
				q.offer(key);
				break;
			case "pop":
				if(q.isEmpty()) sb.append("-1"+"\n");
				else sb.append(q.poll()+"\n");
				break;
			case "size":
				sb.append(q.size()+"\n");
				break;
			case "empty":
				if(q.isEmpty()) sb.append(1).append("\n");
				else sb.append(0).append("\n");
				break;
			case "front":
				if(q.isEmpty()) sb.append("-1").append("\n");
				else sb.append(q.peek()).append("\n");
				break;
			case "back":
				if(q.isEmpty()) sb.append("-1").append("\n");
				else sb.append(key).append("\n");
				break;
			}
		}
		System.out.println(sb.toString());
	}

}
