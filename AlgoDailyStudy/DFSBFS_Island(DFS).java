package DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Island {
static int N ,res ;
static int[][] arr ;
static int[] dx = {-1,-1,0,1,1,1,0,-1} , dy = {0,1,1,1,0,-1,-1,-1}; // 8방 탐색
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		StringTokenizer st = new StringTokenizer("");
		for(int i = 0 ; i< N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j= 0 ; j< N ;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		res = 0; // 결과값 
		sol(arr);
		System.out.println(res);

	}
	private static void sol(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ;j++) {
				 if(arr[i][j] == 1) { // 1인 좌표 찾으면
					 res++; // 그룹값 1개 증가.
					 arr[i][j] = 0;  // 처음 시작하는 좌표를 0으로 변경.
					 dfs(i,j); // 해당 좌표를 시작으로 dfs 탐색.
				 }
			}
		}
	}
	private static void dfs(int x, int y) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < dx.length ; i++) { // 8방탐색
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx >= 0 && nx < N  && ny >= 0 && ny < N  && arr[nx][ny] ==1 ) { // 범위가 가능할 때 (다음 범위 1)
				arr[nx][ny] = 0;  // 다음좌표로 넘어갈때 해당 좌표를 초기화
				dfs(nx,ny); // dfs 로 계속 탐색
			}
		}
		
	}

}
