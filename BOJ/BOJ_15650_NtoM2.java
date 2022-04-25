package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NtoM2_BOJ15650 {
static int M , N;
static int[] arr;
static StringBuilder sb;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		
		dfs(1,0);
		System.out.println(sb.toString());
		br.close();
		
	}
	private static void dfs(int st, int depth) {
		// TODO Auto-generated method stub
		if(depth == M) {
			for(int i : arr) {
				sb.append(i+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = st; i <= N; i++) {
			arr[depth] = i;
			dfs(i+1, depth+1);
		}
	}

	

}
