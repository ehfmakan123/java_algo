package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GameDevelop {
static int N,M,x,y,d;
static StringTokenizer st;
static boolean[][] come = new boolean[50][50];
static int[][] arr = new int[50][50];
static int dx[] = {-1,0,1,0};
static int dy[] = {0,1,0,-1};

private static void turn() {
	// TODO Auto-generated method stub
	d-- ;
	if(d == -1) {
		d = 3;
	}
}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res/GameDevelop.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		x =  Integer.parseInt(st.nextToken());
		y =  Integer.parseInt(st.nextToken());
		d =  Integer.parseInt(st.nextToken());
		
		come[x][y] = true;
		
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < M ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int cnt = 1;
		int turn = 0 ;
		while(true) {
			turn();
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(!come[nx][ny] && arr[nx][ny] == 0) {
				come[nx][ny] = true;
				x = nx;
				y = ny;
				cnt++;
				turn = 0 ;
				continue;
			}else {
				turn ++;
			}
			if(turn == 4) {
				nx = x -dx[d];
				ny = y -dy[d];
				if(arr[nx][ny] == 0 ) {
					x = nx;
					y = ny;
				}else 	break;
				turn = 0 ;
			}
		}
		System.out.println(cnt);
	}

}
