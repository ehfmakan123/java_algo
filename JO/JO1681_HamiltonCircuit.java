package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HamiltonCircuit_JO1681 {
	static int res = Integer.MAX_VALUE; // 간선 가중치 합의 최소값 저장 예정(MAX 초기화)
	static int N ;
	static int[][] map;
	static boolean[] chk;
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/Hamilton_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st ;
		map = new int [N][N];
		chk = new boolean[N];
		
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0 ; j < N ;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0,0,0);
		System.out.println(res);
		// 0번에서 출발하여 모든곳을 방문하고 0번으로 복귀
		// 모든곳을 들린 다음 마지막에 0번으로 갈 수 있는 경우를 확인.
	}
	private static void dfs(int s, int i, int w) {
		if(w >= res ) {	//기저조건 , 중간값이 목표치보다 클 경우
			return;
		}
		if(i == N-1) { // 모든 정점을 지남.
			if(map[s][0] != 0) { // 다시 원점으로 복귀 할 수 있는가
				res = Math.min(res, w + map[s][0]);
			}
			return;
		}
		for(int j = 1; j <N ;j++) { // 시작점은 제외함(0)
			if(map[s][j] != 0 && !chk[j]) { // 방문가능하면서 방문한적이 없는지 체크
				chk[j]= true;
				dfs(j,i+1,map[s][j]+w);
				chk[j] = false;
			}
		}
		
	}
}
