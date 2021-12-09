package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N , M ,T, res; // 입력값 , 출력 결과값 지정
	static int[][] map; 	// 입력받은 값으로 만들 배열
	static boolean[] chk;	// 방문여부 체크 배열
	
	static void dfs(int s , int n) {	//dfs로 탐색
		if(!chk[s]) {	// 해당 위치의 값 방문여부 
			chk[s] = true;
			for(int i = 1 ; i < n ; i++) {
				if(map[s][i] == 1 && !chk[i]) {	// 관계가있고 방문하지않았으면 다음 탐색
					dfs(i,n);
				}
			}
		}
	}
	
	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("res/CDvillage_input.txt"));
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		T = Integer.parseInt(br.readLine());
		StringBuilder sb =new StringBuilder();
		
		for(int tc = 1 ; tc <= T ; tc++) {
			
			sb.append("#").append(tc).append(" ");
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			map = new int[N+1][N+1]; // 맵의 크기를 N+1 으로 지정 (사람의 번호가 1 ~ N까지므로 편의성을 위함)
			chk = new boolean[N+1];// 맵의 크기를 N+1 으로 지정 (사람의 번호가 1 ~ N까지므로 편의성을 위함)
			int res = 1 ; // 기본적으로 무리 1개 이상.
			for(int i = 0 ; i < M ; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				map[x][y] =1; // 간선 표시 배열에 값을 저장.
				map[y][x] =1;	// 무향가중치 x 그래프
			}
			for(int i = 1 ; i<N+1 ; i++) {
				if(!chk[i]) {	// 탐색여부 확인
					dfs(i,N+1);
					for(int j = 1; j < N+1 ; j++) {
						if(!chk[j]) {
							res++;	//  dfs 돌고 온 뒤 결과값 추가.
							break;
						}
					}
				}
			}
			sb.append(res).append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
}
