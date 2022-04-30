package DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GuessSequence {
static int N, F; 
static int[][] arr; // comb 저장 배열
static int[] b,p; // 조합 값 (nCn ~ nC0), 만들어진 순열 값
static boolean[] chk; // 중복체크를 위한 배열
static boolean flag; // 값을 찾으면 break를 해줄 flag
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		F =Integer.parseInt(st.nextToken());
		b = new int[N];
		p = new int[N]; // N개 중에 N개
		chk = new boolean[N+1]; // 1 ~ N 사용
		arr = new int[35][35]; // 큰 배열 (조합 저장)
		
		for(int i = 0 ; i < N ;i++) {
			b[i] = comb(N-1,i); // N-1Cr 조합 구해서 저장.
		}
		dfs(0,0);
	}
	private static void dfs(int D, int sum) { 
		// TODO Auto-generated method stub
		if(flag) return; // 값을 찾았으면 flag를 통해 나머지 return 
		if(D == N) { // 깊이가 도달
			if(sum==F) { // 도달한 깊이에서 sum 이 목표값이면
				for(int x : p)	System.out.print(x+" "); // 순열에 넣어놓은 값을 출력.
				flag = true; // 값을 찾았음을 표시.
			}
		}
		else { // 깊이가 N 전이면 (N개의 수의 순열을 만들지 못함 아직)
			for(int i = 1 ; i<= N ; i++) { // 1~N 수열
				if(!chk[i]) { // 방문여부
					chk[i] = true;
					p[D] = i; // 순열[D] 에 값 i 를 넣음
					dfs(D+1, sum + p[D] * b[D]); // 다음 dfs 깊이가 1증가 sum += (해당 자리 방문 순열 * 해당하는 자리의 조합)
					chk[i] = false; // 방문해제.
				}
			}
		}
		
	}
	private static int comb(int n, int r) { // 조합을 먼저 돌림
		// TODO Auto-generated method stub
		if(arr[n][r] > 0) return arr[n][r]; // 메모이제이션
		if(n == r || r == 0) {
			return 1;
		}else return arr[n][r] = comb(n-1,r-1) + comb(n-1,r);
	}

}

//두개 구현하는건 어렵구나... ㅠㅠ
