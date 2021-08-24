package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N , M ,T, res;
	static int[][] map;
	static boolean[] chk;
	
	static void dfs(int s , int n) {
		if(!chk[s]) {
			chk[s] = true;
			for(int i = 1 ; i < n ; i++) {
				if(map[s][i] == 1 && !chk[i]) {
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
			map = new int[N+1][N+1];
			chk = new boolean[N+1];
			int res = 1 ;
			for(int i = 0 ; i < M ; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				map[x][y] =1;
				map[y][x] =1;
			}
			for(int i = 1 ; i<N+1 ; i++) {
				if(!chk[i]) {
					dfs(i,N+1);
					for(int j = 1; j < N+1 ; j++) {
						if(!chk[j]) {
							res++;
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

