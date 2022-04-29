package DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class MaxScore {
static int N , M,res;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][2];
		
		for(int i = 0 ; i < N ;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		res = -1;
		
		dfs(0,0,0,arr);
		
		System.out.println(res);
		
	}
	private static void dfs(int D, int time, int sum , int[][] arr) { // 깊이 ,시간 ,총합 , 대상 배열
		// TODO Auto-generated method stub
		if(time > M ) return; // 시간초과시 리턴
		if(D == N ) { // 목표 깊이에 도달
			res = Math.max(res, sum); // 최대값 변경
		}else {
			dfs(D+1 , time+arr[D][1] , sum+arr[D][0] , arr); // 선택 dfs
			dfs(D+1 , time , sum , arr);                    // 비선택 dfs
		}
	}

}
