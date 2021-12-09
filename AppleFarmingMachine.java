package Test;
import java.io.*;
import java.util.*;

public class AppleFarmingMachine {
	
	static int R, C, apple, answer, maze[][];
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("res/AppleFarmingMachine.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			maze = new int[R][C];
			apple = 0;
			answer = 0;
			
			for (int i = 0; i < R; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < C; j++) {
					maze[i][j] = Integer.parseInt(st.nextToken());
					if (maze[i][j] == 2) apple++;
				}
			}
			
			bfs();
			sb.append("#").append(tc+1).append(" ").append(answer).append("\n");
		}
		System.out.println(sb);
	}
	
	static void bfs() {
		ArrayDeque<Object[]> que = new ArrayDeque<>();
		boolean[][] visited = new boolean[R][C];
		visited[0][0] = true;
		que.offer(new Object[] {visited, new int[] {0, 0, 0, 0}}); //방문처리 배열, x좌표, y좌표, 지나온 거리, 먹은 사과 수
		
		while (!que.isEmpty()) {
			Object[] obj = que.poll();
			boolean[][] map = (boolean[][])obj[0];
			int[] point = (int[])obj[1];
			
			
			if (point[0] == R-1 && point[1] == C-1) {
				if (point[3] == apple) {
					answer = point[2];
					return;
				} else {
					continue;
				}
			}
			
			for (int d = 0; d < dx.length; d++) {
				int nx = point[0] + dx[d];
				int ny = point[1] + dy[d];
				
				if (0<=nx && nx<R && 0<=ny && ny<C && !map[nx][ny] && maze[nx][ny] != 1) {
					boolean[][] copy = copy(map);
					copy[nx][ny] = true;
					if (maze[nx][ny] == 2) {
						que.offer(new Object[] {copy, new int[] {nx, ny, point[2]+1, point[3]+1}});
					} else {
						que.offer(new Object[] {copy, new int[] {nx, ny, point[2]+1, point[3]}});
					}
				}
			}
		}
	}
	
	static boolean[][] copy(boolean[][] original) {
		boolean[][] temp = new boolean[R][C];
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				temp[i][j] = original[i][j];
			}
		}
		
		return temp;
	}
	
}



// input.txt

// 5
// 3 5
// 0 0 0 0 0
// 0 1 0 2 0
// 0 2 0 0 0
// 2 4
// 0 1 2 0
// 0 0 0 0
// 5 5
// 0 1 0 1 1
// 0 1 0 2 1
// 0 1 2 0 0
// 0 0 0 0 1
// 0 0 0 0 0
// 4 2
// 0 0
// 1 0
// 2 0
// 0 0
// 3 6
// 0 0 0 0 0 0
// 0 1 0 2 0 2
// 0 0 2 0 0 0











