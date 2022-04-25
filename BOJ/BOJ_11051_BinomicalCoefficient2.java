package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinomicalCoefficient2 {
static int[][] dp ;
static int X = 10007;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N  =Integer.parseInt(st.nextToken());
		int K  =Integer.parseInt(st.nextToken());
		
		dp = new int [N+1][K+1]; // 동적 계획법 ( 2차원 배열에 저장)
		
		System.out.println(comb(N,K));
	}

	private static int comb(int n, int k) {
		if(dp[n][k] > 0) { // 이미 계산한 경우 return
			return dp[n][k];
		}
		
		if(k == n || k == 0) {
			return dp[n][k] = 1;
		}else {
			return dp[n][k] = (comb(n-1,k) + comb(n-1,k-1))%X; // 값을 구하면서 배열에 저장
		}
	}
	
}
