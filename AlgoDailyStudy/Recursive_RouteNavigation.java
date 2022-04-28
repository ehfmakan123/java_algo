package Recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RouteNavigation {
static int[][] graph;
static boolean[] visit;
static int N, M, ans = 0;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visit = new boolean[N+1];
		graph = new int[N+1][N+1]; // 그래프 1~ N 
		
		for(int i = 0 ; i < M ; i++ ) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a][b] = 1;
		}
		visit[1] = true; // 정점 1에서 출발
		dfs(1);
		System.out.println(ans);
	}
	private static void dfs(int v) {
		// TODO Auto-generated method stub
		if(v==N) ans++; // 경로가 하나 생김
		else {
			for(int i = 1 ; i <= N ; i++) {
				if(graph[v][i] > 0 && !visit[i]) { //  간선의 갯수가 0보다 크고 방문 안한경우.
					visit[i] = true;
					dfs(i);
					visit[i] = false;
				}
			}
		}
	}

}
