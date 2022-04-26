package StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SavePrincess {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i = 0 ; i < N ;i++) { // 1 ~ N 입력
			q.offer(i+1);
		}
    
		while(q.size() != 1) { // 큐의 사이즈가 1이 될때까지 반복
			for(int i = 1 ; i < K ; i++) { // K 번째 수는 제외 나머지는 다시 큐에 넣어줘야함
				q.offer(q.poll());
			}
			q.poll(); // K번째 수는 그대로 poll
		}
		System.out.println(q.peek());
	}

}

