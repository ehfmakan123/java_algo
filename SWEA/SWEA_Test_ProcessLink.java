package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProcessLink_SWEATest {
	static int[][] map;
	static int res, N ,total;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	
	
	public static void solve(int cnt , int sum) {
		int x = -1 , y = -1;
		outer:for(int i = 0; i <N-1 ; i++) {
			for(int j = 0 ; j < N-1 ; j++) {
				if(map[i][j] == 1) {
					x = i ;
					y = j ;
					break outer;
				}
			}
		}
		if(x == -1 && y == -1) {
			if(cnt >= total) {
				if(cnt == total) {
					res =  Math.min(res,sum);
				}else {
					res =sum;
					total = cnt;
				}
			}
			return;
		}
		for(int i = 0 ; i < 4 ; i++) {
			int nx = x;
			int ny = y;
			boolean chk = true;
			 while(true) {
	                nx += dx[i];
	                ny += dy[i];
	                if(nx < 0 || nx > N-1 || ny < 0 || ny > N-1) break;
	                if( map[nx][ny] > 0) {
	                    chk = false;
	                    break;
	                }   
	            }
			 if(chk) {
	                cnt++;
	                nx = x;
	                ny = y;
	                while(true) {
	                    nx += dx[i];
	                    ny += dy[i];
	                    if(nx < 0 || nx > N-1 || ny < 0 || ny > N-1) break;
	                    map[nx][ny] = 2;
	                    sum += 1;
	                }
	                map[x][y] = 2;
	                solve(cnt, sum);
	                map[x][y] = 1;
	                cnt--;
	                nx = x;
	                ny = y;
	                while(true) {
	                    nx += dx[i];
	                    ny += dy[i];
	                    if(nx < 0 || nx > N-1 || ny < 0 || ny > N-1) break;
	                    map[nx][ny] = 0;
	                    sum -= 1;
	                }
	            }
	        }
	        map[x][y] = 2;
	        solve(cnt,sum);
	        map[x][y] = 1;
	    }	
	

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/ProcessLink_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb  = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1 ; tc  <= T ;tc++) {
			sb.append("#").append(tc).append(" ");
			N = Integer.parseInt(br.readLine());
			res = Integer.MAX_VALUE; 
			total = 0;
			map = new int [N][N];
			for(int i = 0 ; i < N ; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0 ; j < N ;  j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			solve(0,0);
			sb.append(res).append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
}
