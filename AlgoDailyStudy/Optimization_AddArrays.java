package Optimization;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class AddArrays {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> q2 = new LinkedList<Integer>();
		boolean flag = false;
		for(int i = 0 ; i < N ; i++) {
			q.offer(Integer.parseInt(st.nextToken()));
		}
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < M ;i++) {
			q2.offer(Integer.parseInt(st.nextToken()));
		}
		while(q.size() != 0 && q2.size() != 0) {
			if(q.peek() < q2.peek()) {
				System.out.print(q.poll()+" ");
			}else {
				System.out.print(q2.poll()+" ");
			}
			if(q.size() == 0) {
				flag = true;
			}
		}
		while(true) {
			if(flag) {
				System.out.print(q2.poll()+" ");
				if(q2.size()==0) {
					break;
				}
			}else {
				System.out.print(q.poll()+" ");
				if(q.size() == 0) {
					break;
				}
				
			}
		}
		
	}

}
