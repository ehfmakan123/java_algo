package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato_BOJ7576 {
	static int M , N ,res;
	static int[][] map ;
	static boolean[][] chk;
	static StringTokenizer st;
	static int[] dx = {-1,0,1,0}; 
	static int[] dy = {0,1,0,-1};
	static Queue<Integer> qx = new LinkedList<Integer>();
	static Queue<Integer> qy = new LinkedList<Integer>();
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/Tomato_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine()," ");
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		map = new int [N][M];
		chk = new boolean [N][M];
		res = 0; 
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for (int j = 0 ; j < M ; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 1) {
					qx.add(i);
					qy.add(j);
				}
			}
		}
		bfs();
		br.close();
	}
	private static void bfs() {
		int x , y = 0 ;
		while(!qx.isEmpty() && !qy.isEmpty()) { // 큐에 저장한 토마토가 없을때까지 반복.
			x = qx.poll();// x좌표 큐에저장 
			y = qy.poll();// y좌표 큐에저장
			chk[x][y] = true; // 방문처리
			
			for(int i = 0 ; i < 4 ;i++) { // bfs
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				//범위 지정 및 이동값이 0 이어야하고 ( 토마토 (1) / 벽(-1) 은 못익힘) 방문한적이 없어야함.
				if(nx >= 0 && ny >=0 && nx < N && ny < M && map[nx][ny] == 0 && !chk[nx][ny]) { // 조건확인
					//이제 얘네도 익은 토마토니까 옆으로 익혀줘야함(큐에 넣어줘야함)
					qx.add(nx);
					qy.add(ny);
					map[nx][ny] =map[x][y]+1; // nx,ny좌표에 이전꺼 +1 해서 저장(어차피 0,-1만 아니면 토마토임 ㄹㅇㅋㅋ)
					res = map[nx][ny]; // 저장값을 결과값에 저장함(경과 시간 저장 // 동시에 숙성이 진행된다 생각해야하므로)
				}
			}
		}
		for(int i = 0 ; i< N ; i++) {
			for(int j = 0 ; j<M ; j++) {
				if(map[i][j] == 0) {
					res = -1; // 숙성 전부 시켯는데도 0이 있다?? 바로 캍!
				}
			}
		}
		if(res > 0) {
			System.out.println(res-1); //첨에 시작할때 1에서 시작하니까 끝에 -1 해줘야함
		}else {
			System.out.println(res); // res 가 -1이면 그냥 출력해도됨
		}
	}
	
}
