package DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Permutation2 {
static int N , M ;
static int[] arr , res;
static boolean[] chk;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());	
		M = Integer.parseInt(st.nextToken());
		arr = new int[N]; // 대상 배열 N 칸
		res = new int[M]; // 정답 배열 M 칸
		chk = new boolean[N]; // 방문처리 N칸
    
		st = new StringTokenizer(br.readLine());
		for(int i =0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		sol(0);
		
	}
	private static void sol(int D) { // 깊이 탐색
		// TODO Auto-generated method stub
		if(D == M) {
			for(int x : res) { // 정답 배열을 순회.
				System.out.print(x+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0 ; i < N ; i++) { // N개를 탐색
			if(!chk[i]) { // 방문 한적이 없으면
			chk[i] = true; // 방문 처리
			res[D] = arr[i]; // 결과 배열[해당깊이] 에 입력배열[i번째] 입력
			sol(D+1); // 깊이 증가.
			chk[i] = false; // 깊이에서 빠져나오면 방문해제.
			}
		}
	}

}
