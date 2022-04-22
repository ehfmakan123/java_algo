package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Peaks {
	
static int[] dx = {-1,0,1,0};
static int[] dy = {0,1,0,-1};
static int cnt = 0 ;
static int N ;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int [][] arr = new int [N][N];
		
		for(int i = 0 ; i <N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N ;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		find(arr);
		System.out.println(cnt);
	}

	private static void find(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N; j++) {
				boolean flag = true;
				for(int k = 0 ; k< 4 ;k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					if(nx >= 0 && ny >= 0 && nx < N && ny <N && arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag) cnt++;
			}
		}
	}
}

// 사방탐색 .. 주변에 하나라도 만족 안하면 flag 를 false 처리해서 break
