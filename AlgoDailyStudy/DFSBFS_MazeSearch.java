package DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MazeSearch {
static int[][] arr;
static int res;
static int[] dx  = {-1,0,1,0}, dy = {0,1,0,-1} ;
static boolean[][] chk;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		
		
		arr = new int[7][7]; //시작 배열
		chk = new boolean[7][7];  // 방문처리 배열
		
		for(int i = 0 ; i < 7 ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j < 7 ;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		res = 0; // 결과값.
		arr[0][0] = 1;     // 시작배열 초기화
		chk[0][0] = true;  // 시작배열 초기화 
		
		dfs(0,0);
		
		System.out.println(res);

	}
	private static void dfs( int x , int y) {
		// TODO Auto-generated method stub
		
		if(x == 6 && y == 6) { // 도착하면 res++
			res++;
		}else {
			for(int i = 0 ; i < 4; i++) { // 4방탐색
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && !chk[nx][ny] && arr[nx][ny] == 0) { // 조건 설정
					chk[nx][ny] = true; //방문처리 
					dfs(nx ,ny);	// dfs 
					chk[nx][ny] = false; // 방문처리 해제.
				}
			}
		}
	}

}
