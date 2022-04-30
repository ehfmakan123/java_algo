package DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoinExchange {
static int N ,M ,res;
static int[] coins;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		coins = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			coins[i] = Integer.parseInt(st.nextToken());
		}
		
		M = Integer.parseInt(br.readLine());
		res = Integer.MAX_VALUE ;
		
		sol(0,0);
		System.out.println(res);
	}
	private static void sol(int D, int sum) {
		// TODO Auto-generated method stub
		if(D >= res) return; // 이미 최솟값을 구했는데 그거보다 깊이가 클 경우 계산 X (효율성)
		if(sum > M) { // 합계가 목표보다 클 경우.
			return;
		}else if( sum == M) { // 합계가 목표랑 같은 경우.
			res = Math.min(res, D);
		}
		for(int i = N-1 ; i >= 0  ;i--) { // 단위가 큰 코인부터 입력. (효율성)
			sol(D+1 , sum+coins[i]);
		}
	}
}
