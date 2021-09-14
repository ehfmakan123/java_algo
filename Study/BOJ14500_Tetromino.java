package algo.study;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tetromino_BOJ14500 {
	static int N , M , res; // N , M , 결과값
	static int[][] map ; // 배열 넣을 map
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};	
	static boolean chk[][];		// 방문확인용 chk 배열
	static StringTokenizer st;	
	
	private static void dfs(int x, int y , int depth , int sum) {
		if(depth == 4 ) {
			res = Math.max(res, sum);
			return;
		}
		for(int i = 0 ;i < 4 ; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx < 0 || ny < 0 || nx >= N || ny >=M || chk[nx][ny]) { // 범위설정
				continue;
			}
			chk[nx][ny] = true;
			dfs(nx,ny,depth+1, sum + map[nx][ny]);
			chk[nx][ny] = false;
		}
	}
	
	private static void etc(int x, int y) {
		int wing = 4;
		int min = Integer.MAX_VALUE;
		int sum = map[x][y];
		for(int i = 0 ; i < 4 ; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(wing <= 2) return;
			if(nx < 0 || ny < 0 || nx >= N || ny >= M) {
				wing -- ;
				continue;
			}
			min = Math.min(min, map[nx][ny]);
			sum += map[nx][ny];
		}
		if(wing == 4) {
			sum -= min;
		}
		res = Math.max(res, sum);
	}
	
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/tetro_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		chk = new boolean[N][M];
		
		for(int i = 0 ; i < N ; i++) { // N * M 배열에 입력값을 저장
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j <M ; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}	
		
		for(int i = 0 ;i < N ; i++) {
			for(int j= 0 ; j <M ; j++) {
				dfs(i,j,0,0); // dfs로 검색
				etc(i,j);	// 예외처리 ( ㅏ , ㅓ , ㅗ , ㅜ) // dfs에서 검색이안됨 
			}
		}
		System.out.print(res);
		br.close();
	}
}
