package DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Permutation {	// 중복을 포함한 순열
static int N, M ;
static int[] ans; 
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		ans = new int[M];
		sol(0);
	}
  
	private static void sol(int D) {
		// TODO Auto-generated method stub
		if(D == M) { // 깊이가 같아질때 출력.
			for(int x : ans) {
				System.out.print(x+" ");
			}
			System.out.println();
			return;
		}else { // ans 배열에 자릿수 넣어주기. 내림차순 정렬은 범위를 반대로 설정
			for(int i = 1 ; i <= N ;i++) {
				ans[D] = i ;
				sol(D+1);
			}
		}
		
	}

}
