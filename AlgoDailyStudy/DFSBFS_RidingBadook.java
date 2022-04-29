package DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RidingBadook {
static int C , N ,answer;
boolean flag ;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		C = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		int[] arr =new int[N];
		answer = -1; // 초기화
		
		dfs(0,0,arr);
		System.out.println(answer);
	}
	private static void dfs(int L, int sum, int[] arr) { // 시작배열 , 현재까지의 합 , 대상 배열
		// TODO Auto-generated method stub
		if(sum > C) return;// 합이 기준치 넘으면 return;
		if(L == N) { // 마지막까지 돌았으면 // (O,X)
			answer = Math.max(answer, sum); // 현재까지의 합과 이전 ans 중 최대값 
		}
		else {
			dfs(L+1 , sum+arr[L] , arr); // 현재 배열을 추가하는 경우의 수
			dfs(L+1 , sum , arr);	// 현재 배열을 추가하지 않는 경우의 수		}
		
	}

}
