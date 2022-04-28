package Recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class FindCalf {
static int[] dis ;
static boolean[] chk;
static Queue<Integer> q = new LinkedList<Integer>();
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken()); //현수의 위치
		int E = Integer.parseInt(st.nextToken()); // 송아지의 위치
		dis = new int[] { -1, 1,5};
		chk = new boolean[10001]; // 전체 경우의 수 방문처리 배열
		System.out.println(bfs(S,E));
	}
	private static int bfs(int s, int e) {
		// TODO Auto-generated method stub
		chk[s] = true; // 출발지 방문처리
		q.offer(s); // 큐에 출발지를 넣음.
		int res = 0 ; // 처음 레벨값.
		while(!q.isEmpty()) { // 큐가 빌때까지
			int len = q.size(); // 큐의 길이만큼 순회 (해당 깊이의 노드 갯수)
			for(int i = 0 ; i < len ; i++) {
				int x = q.poll();
				if(x == e) return res; // 노드탐색 중 목표값응ㄹ 찾으면 return 
				for(int j : dis) { // 갈수있는 경우의 수 ( -1,1,5)
					int nx = x + j ;
					if(nx >=1 && nx <= 10000 && !chk[nx]) { // 갈 수 있는 범위 && 아직 방문 안한곳
						chk[nx] = true; // 방문처리
						q.offer(nx); // 큐에 넣어주기
					}
				}
			}
			res++; // for문이 한번 돌면 레벨을 1씩 추가
		}
		return 0; 
	}

}
