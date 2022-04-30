package DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class MazeMinDis {
static int[][] arr , dis;
static boolean[][] chk;
static int[] dx = {-1,0,1,0} , dy = { 0,1,0,-1};
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		arr = new int[7][7];
		dis = new int[7][7]; // 거리를 저장할 배열
		chk = new boolean[7][7];
		
		for(int i = 0 ; i < 7 ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < 7 ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		bfs(0,0);
    
		if(dis[6][6] == 0) {
			System.out.println("-1");
		}else {
			System.out.println(dis[6][6]);
		}

	}
	private static void bfs(int x, int y) {
		// TODO Auto-generated method stub
		Queue<Point> q = new LinkedList<>(); // bfs는 큐를 사용
		q.offer(new Point(x,y)); // 포인트를 저장.
		chk[x][y] = true; // 시작값 방문처리.
		while(!q.isEmpty()) { // 큐가 빌때까지 처리.
			Point tmp = q.poll(); // 큐에 넣은값을 빼서
			for(int i = 0 ; i< 4; i++) { // 사방탐색
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && !chk[nx][ny] && arr[nx][ny] == 0) { // 범위안이고 갈 수 있고 방ㅇ문안했으면
					chk[nx][ny] = true; // 이동할곳을 방문처리
					q.offer(new Point(nx,ny)); // 큐에 넣는다.
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1; // 다음값 거리 배열 +1 (현재 포인트의 거리 배열 +1)
				}
			}
		}
	}

}

class Point{ // (x,y) 합쳐서 Point class로 관리.
	public int x,y;
	Point(int x , int y){
		this.x = x;
		this.y = y;
	}
}
