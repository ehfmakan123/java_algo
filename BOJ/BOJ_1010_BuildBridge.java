package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BuildBridge {
static int[][] arr = new int[30][30];
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i = 0 ; i < N ;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			sb.append(comb(y,x)+"\n");
		}
		System.out.println(sb.toString());
	}

	private static int comb(int x, int y) {
		// TODO Auto-generated method stub
		if(arr[x][y] > 0) {   // 동적 할당 (이미 계산한 값이면 return)
			return arr[x][y];
		}
		
		if(x == y || y == 0) { // nCn 이거나 nC0 의 경우 =1)
			return arr[x][y] = 1;
		}
		return arr[x][y] = comb(x-1 , y-1) + comb(x-1, y); // nCr = c-1Cr-1 + n-1Cr 성질을 이용!
	}
}
