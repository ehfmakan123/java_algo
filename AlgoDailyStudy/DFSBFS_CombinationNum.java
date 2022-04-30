package DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CombinationNum {
static int N,R,res;
static int[][] temp;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		temp = new int[35][35]; // n , r 저장할 넉넉한 배열 (memoization)
		System.out.print(comb(N,R));
	}
	private static int comb(int n , int r) {
		// TODO Auto-generated method stub
		if(temp[n][r] != 0) { // 이미 계산 했던 수면 return;
			return temp[n][r];
		}
		if(n == r || r ==0 ) { // 1이 나오는 조합수.
			return 1;
			  // nCn nC0 => 1;
		}
		return temp[n][r] = comb(n-1 , r) + comb(n-1 , r-1); // 값을 구하면서 temp에 저장.
	}

}
