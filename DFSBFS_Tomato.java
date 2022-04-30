package DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomatos {
static int M , N ,res;
static int[][] arr, time;
static int[] dx = {-1,0,1,0} , dy = {0,1,0,-1};
static Queue<Point> q ; 
static boolean flag; // 전부 안익는 경우 처리를 위한 flag
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub\
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M =Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		q = new LinkedList<Point>();
		arr = new int[N][M];
		time = new int[N][M]; // 걸리는 시간을 저장해줄 배열.
		
		for(int i =0 ; i < N ;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < M ;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1) {
					q.offer(new Point(i, j)); // 1인 경우를 q에 미리 넣어놓자!
				}
			}
		}
    
		res = Integer.MIN_VALUE;
    
		bfs();
		
		for(int i =0 ; i < N ;i++) {
			if(flag) break;
			for(int j = 0 ; j < M ;j++) {
				if(arr[i][j] == 0) { // bfs 후에도 아직 안익은게있으면
					flag = true;
					System.out.println("-1"); // -1출력
					break;
				}
				res = Math.max(res, time[i][j]); // 전체 배열을 보며 가장 큰 값을 저장(가장 큰값 => 최소시간)
			}
		}
		if(!flag) System.out.println(res); // 안익은거 없으면 res 출력
		
	}
	private static void bfs() {
		// TODO Auto-generated method stub
		while(!q.isEmpty()) { 
			Point tmp = q.poll();
			for(int i = 0 ; i < dx.length; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx >= 0 && nx < N && ny >= 0 && ny < M && arr[nx][ny] == 0 ) { // 0인 경우에만 이동 (1은 처음에 큐에 들어가서 시작함)
					arr[nx][ny] = 1; // 0 -> 1
					q.offer(new Point(nx,ny)); // 새롭게 익은 토마토를 큐에 저장
					time[nx][ny] = time[tmp.x][tmp.y] + 1; // 걸리는 시간을 저장 (이전배열의 시간 + 1)
				}
			}
		}
		
	}

}

class Point{
	public int x ,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


// 시간 배열을 따로 안하고 -1이 아닌애들은 전부 ++ 해서 계산하려 했더니 복잡해져서 시간 배열 만들어서 풀었음.
