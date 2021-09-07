package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Dam_Depth {

	static int[] dx = {-1,-1,0,1,1,1,0,-1};
	static int[] dy = {0,1,1,1,0,-1,-1,-1};
	static char[][] map ;
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/Dam_Depth_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <=T ; tc++) {
			sb.append("#").append(tc).append(" ");
			int N = Integer.parseInt(br.readLine());
			map = new char[N][N];
			for(int i = 0 ; i< N ; i++) {
				String str[] = br.readLine().split(" ");
				for(int j = 0 ; j < N ; j++) {
					map[i][j] = str[j].charAt(0);
				}
			}
			
			int max = -1;
			for(int i = 0 ; i < N ; i++) {
				for(int j = 0 ; j< N ; j++) {
					if(map[i][j] == 'W') {
						int cnt = 0 ;
						for(int d = 0 ; d < 8 ; d++) {
							int nx = i + dx[d];
							int ny = j + dy[d];
							if(nx <0 || ny<0 || nx >= N || ny >= N || map[nx][ny] =='G') continue;
							else cnt++;
						}
						if(cnt == 0) cnt = 1;
						max = Math.max(max,cnt);
					}
				}
			}
			sb.append(max+"\n");
			
		}
		System.out.println(sb.toString());
		br.close();
	}
}
