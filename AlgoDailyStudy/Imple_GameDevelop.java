package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GameDevelop {
static int N,M,x,y,d; 
static StringTokenizer st;
static boolean[][] come = new boolean[50][50]; // 방문처리
static int[][] arr = new int[50][50]; // 입력 배열

static int dx[] = {-1,0,1,0}; // 상우하좌
static int dy[] = {0,1,0,-1};

private static void turn() { // 방향처리 
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
		
		come[x][y] = true; // 시작점을 방문처리
		
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < M ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int cnt = 1; // 시작점 방문처리 
		int turn = 0 ; // 방향 바꾼 횟수
		while(true) {
			turn(); // 왼쪽 방향으로 방향부터 바꾸고 시작
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(!come[nx][ny] && arr[nx][ny] == 0) {// 방문 기록 X , 바다가 아니면 ( != 1)
				come[nx][ny] = true; // 방문기록
				x = nx;
				y = ny;
				cnt++; // 이동한 칸 개수 증가
				turn = 0 ; // 제자리에서 방향 바꾼 횟수 초기화
				continue;
			}else {
				turn ++;
			} 
			if(turn == 4) { // 제자리에서 4번 돈 경우 ( 어느 방향으로도 이동 X)
				nx = x -dx[d];
				ny = y -dy[d];
				if(arr[nx][ny] == 0 ) { // 뒤로 갈 수 있는 경우
					x = nx;
					y = ny;
				}else 	break; // 막혀있으면 종료
				turn = 0 ; // 방향 전환 횟수 초기화
			}
		}
		System.out.println(cnt);
	}

}
