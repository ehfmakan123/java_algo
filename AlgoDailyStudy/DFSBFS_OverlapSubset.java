package DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OverlapSubset {
static int[] pm ;
static int N , M ;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N =Integer.parseInt(st.nextToken());
		M =Integer.parseInt(st.nextToken());
		pm = new int[M];
		
		dfs(0);
	}
	private static void dfs(int D) {
		// TODO Auto-generated method stub
		if(D == M) {
			for(int x : pm) {
				System.out.print(x+" ");
			}
			System.out.println();
		}else {
			for(int i = N ; i >= 1 ;i--) { // 여기만 바꿔주면 33 -> 11 부터로 변경 가능
				pm[D] = i;
				dfs(D+1);
			}
		}
			
	}

}
