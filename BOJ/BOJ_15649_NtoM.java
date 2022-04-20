package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NtoM_BOJ15649 {
	public static int[] arr; // 전체를 담을 배열
	public static boolean[] visited; // 방문 처리용 배열
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args)throws Exception {
		
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M]; // 사용 숫자 갯수 M
		visited = new boolean[N]; // 전체 숫자 N
		
		dfs(N,M,0);
		br.close();
		System.out.println(sb.toString());
		
	}

	private static void dfs(int N, int M, int depth) { 
		// TODO Auto-generated method stub
		if(depth == M) { // 사용한 숫자가 M개 일때
			for(int val : arr) { // arr 배열에 있는걸 전부 꺼냄
				sb.append(val+" ");
			}
			sb.append("\n");
			return;
		}
		for(int i = 0 ; i < N ; i++) {
			if(!visited[i]) { // 중복 아닐때
				visited[i] = true; // 방문처리
				arr[depth] = i+1;  // 1 부터 저장
				dfs(N,M,depth+1); // 다음 깊이로 탐색
				visited[i] = false; // 다 해결 하고 나왔으면 방문처리 풀기
			}
		}
	}

}

//dfs bfs 는 왤캐 안될까 ㅠㅠ
