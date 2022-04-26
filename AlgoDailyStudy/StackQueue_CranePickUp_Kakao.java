package StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class CranePickUp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N  = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer("");
		int[][] arr = new int[N][N];
		for(int i =0 ; i < N ; i++) {
			st  = new StringTokenizer(br.readLine());
			for(int j = 0 ;  j< N ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int M = Integer.parseInt(br.readLine());
		
		int[] moves = new int[M];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < M ;i++) {
			moves[i] = Integer.parseInt(st.nextToken())-1;
		}
		Stack<Integer> s = new Stack<>();
		int res = 0;
		
//		for(int x : moves) {
//			System.out.print(x+" ");
//		}
		
		for(int x : moves) {
			int cnt = 0 ;
			
			while(arr[cnt][x] == 0 && cnt != N-1) {
				if(cnt < N-1) cnt++;
			}
			int key = arr[cnt][x];
			
			if(key != 0) {
				if(!s.isEmpty() && s.peek().equals(key)) {
					s.pop();
					res+=2;
				}else { 
					s.push(key);
				}
				arr[cnt][x] = 0;
			}
		
		}
		System.out.println(res);
	}
}
