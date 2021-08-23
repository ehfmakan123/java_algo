package Test;

import java.io.*;
import java.util.*;
public class GraphTest {
	static int N;
	static boolean[][] adjMatrix;
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("res/Graph_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		adjMatrix = new boolean[N][N];
		int C = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < C ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			adjMatrix[to][from] = adjMatrix[from][to] = true;
		}
		System.out.println("====================bfs======================");
		bfs();
		System.out.println("====================dfs======================");
		boolean[] visited = new boolean[N];
		dfs(0,visited);
    br.close();
	}
	private static void bfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean[] visited = new boolean[N];
		
		queue.offer(0);
		visited[0] = true;
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			System.out.println((char)(current+65));
			for(int i = 0 ; i < N ; i++) {
				if(!visited[i] // 방문한지 안한지 확인 
						&& adjMatrix[current][i]) { // 인접한건지 확인(연결 되었는가)
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
	}
	
	private static void dfs(int current , boolean[] visited) {
		visited[current] = true;
		System.out.println((char)(current+65));
		for(int i = 0 ; i < N ; i++) {
		if(!visited[i] && adjMatrix[current][i]) {
			
			dfs(i,visited);
			}
		}
	}
}
