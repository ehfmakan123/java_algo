package plus;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
	private static int N , res , res2;
	private static char[][] map ;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static boolean[][] chk ;
	
	private static void dfs(int x, int y) {
		chk[x][y] = true;
		
		for(int i = 0 ; i < 4 ; i++) {
			int nx = x +dx[i];
			int ny = y +dy[i];
			
			if(nx < 0 || ny < 0 || nx >= N || ny >= N || chk[nx][ny]) continue;
			else if(map[nx][ny] == map[x][y]) {
				dfs(nx,ny);
			}
		}
	}
	
	
	public static void main(String args[]) throws Exception{
		System.setIn(new FileInputStream("res/RGC_blind_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new char [N][N];
		chk = new boolean[N][N];
		
		res = 0 ;
		res2 = 0 ;
		
		for(int  i = 0 ; i < N ; i++) {
			String str = br.readLine();
			for(int j = 0 ; j < N ; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		for(int i = 0 ; i < N ; i ++) {
			for(int  j = 0 ; j <N ; j++) {
				if(chk[i][j] == false) {
					res++;
					dfs(i,j);
				}
			}
		}
		for(int  i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				if(map[i][j] == 'G') {
					map[i][j] = 'R';
				}
			}
		}
		chk = new boolean[N][N];
		for(int i = 0 ; i < N ; i ++) {
			for(int  j = 0 ; j <N ; j++) {
				if(chk[i][j] == false) {
					res2++;
					dfs(i,j);
				}
			}
		}
		System.out.println(res+" "+res2);
		br.close();
	}
}

