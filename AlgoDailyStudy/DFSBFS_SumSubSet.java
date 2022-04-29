package DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumSubset {
static String ans = "NO";
static int N , total = 0 ;
static boolean flag = false;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0 ; i < N ;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			total += arr[i];
		}
		dfs(0,0,arr);
		System.out.println(ans);
	}
  
  
	private static void dfs(int L, int sum, int[] arr) {
		if(flag || sum > total/2) return;
		// TODO Auto-generated method stub
		if(L == N) {
			if((total - sum) == sum) {
				ans ="YES";
				flag = true;
			}
		}else {
			dfs(L+1,sum +arr[L],arr);
			dfs(L+1,sum , arr);
		}
		
	}

}
