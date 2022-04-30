package DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Island_BFS {
static int N ,res;
static int[][] arr;
static int[] dx = {-1,-1,0,1,1,1,0,-1} , dy = {0,1,1,1,0,-1,-1,-1}; // 8방 탐색

static Queue<Point> q ;

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		StringTokenizer st = new StringTokenizer("");
		
		for(int i = 0 ; i < N ;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N ;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
    
		q= new LinkedList<Point>(); // 배열 이용 (BFS)
		res = 0;
		sol();
		System.out.println(res);
	}
	private static void sol() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < N ;i++) {
			for(int j = 0 ; j <N ;j++) {
				if(arr[i][j] == 1) { // 1 발견하면 cnt 1 증가 후 q에 해당 좌표 넣고  
					res++;
					q.offer(new Point(i,j));
					arr[i][j] = 0; // 초기화
					bfs(i,j); // 이후 연결된 땅 탐색 (bfs)
				}
			}
		}
		
	}
	private static void bfs(int x, int y) {
		while(!q.isEmpty()) { // 큐가 빌때까지.
			Point tmp = q.poll();
			
			for(int i = 0 ; i < dx.length ; i++) { // 8방탐색
				
				int nx = tmp.x + dx[i]; // tmp.x 해야되는데 x 넣어서 이거 찾는데 15분정도 썻음;; ㅠ
				int ny = tmp.y + dy[i];
				
				if(nx >= 0 && nx < N && ny >=0 && ny < N && arr[nx][ny] ==1) { // 범위 설정.
					q.offer(new Point(nx,ny)); // 조건 만족시 다음 큐에 저장
					arr[nx][ny] = 0; // 방문했으니 0
				}
			}
		}
	}

}

class Point{ 
	int x , y ;
	public Point(int x , int y) {
		this.x =x;
		this.y =y;
	}
}



// 옛날에 못풀었는데 이번엔 풀었음 오타 없엇으면 더 빨리 풀었을것 같음.. 코드가 길어질수록 오타 확률이 늘어나니까 첨부터 정확하게 짜도록 연습하자
