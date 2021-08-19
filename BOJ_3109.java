package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bakery_BOJ3109 {
	private static boolean chk[][];
	private static int res , R , C;
	private static char[][] map;
	private static int[] dx = {-1,0,1};
	private static int[] dy = {1,1,1};
	
	
	private static boolean search(int x , int y) {
		
		for(int i = 0 ; i < 3 ; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx>= 0 && ny >= 0 && nx < R && ny < C) {
					if(chk[nx][ny] == false && map[nx][ny] == '.') {
						chk[nx][ny] = true;
						if(ny == C -1) {
							return true;
						}
						if(search(nx,ny)) {
							return true;
						}
					}
			}
		}
		return false;
	}

	public static void main(String[] args)throws Exception{
		System.setIn(new FileInputStream("res/Bakery_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new char[R][C];
		chk = new boolean[R][C];
		for(int i = 0 ; i<R ; i++) {
			String str = br.readLine();
			for(int j = 0 ; j < C ; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		res = 0;
		
		for(int i = 0 ; i < R ; i++) {
			if(search(i,0)) {
				res++;
			}
		}
		System.out.print(res);
		br.close();
	}
	
}
