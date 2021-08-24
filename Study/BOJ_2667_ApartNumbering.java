package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static StringTokenizer st ;
	public static int N ;
	public static int[][] map ; // 입력받은값 저장 배열
	public static boolean[][] chk ; // 방문여부 체크
	public static int[] dx = { -1, 0, 1, 0 };
	public static int[] dy = { 0, 1, 0, -1 };
	static int res = 1 ; // 결과값(단지의 수)
	static int[] arr ; // 
	
	public static void dfs(int i , int  j) {
		map[i][j] = res;
		chk[i][j] = true;	// 해당 좌표의 값을 차별화(n번) / 방문 여부 체크
		 for(int k = 0; k<4; k++) { // 사방탐색
	            int nx = i + dx[k];
	            int ny = j + dy[k];
	            if(nx >= 0 && nx < N && ny >= 0 && ny < N) { // 범위체크
	                if(map[nx][ny] == 1 && !chk[nx][ny]) {  //  다음 위치 아파트 확인 / 방문여부
	                    dfs(nx, ny); // 다음 위치를 탐색
	                }
	            }
	        }
		}
	
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/Apart_Numbering_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N]; // N * N 배열 입력
		chk = new boolean[N][N]; // 방문 확인 배열
		for(int i = 0 ; i < N ; i++) {
			String[] str = br.readLine().split(""); // token해서 하기 힘들어서 string으로 받고 split
			for(int j = 0 ; j <N ; j++) {
				map[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j< N ; j++) {
				if(!chk[i][j]&&map[i][j]==1) { //현재위치 방문여부 / 아파트인지 확인.
					dfs(i,j);	// 탐색
					res++; //단지수+1 
				}
			}
		}
		System.out.println(res-1); //첨에 1로 시작했어서 -1해줘야함.
		
		arr = new int [res];	// n번 단지의 아파트 숫자 저장할 배열
		for(int i = 0 ;  i < N ; i++) {
            for(int j= 0 ; j< N ; j++) {
                if(map[i][j] != 0)
                    arr[map[i][j]]++; // arr[n] => n번 단지안에 있는 아파트의 숫자 
            }
        }
		
		Arrays.sort(arr); // 오름차순 출력을 위한 정렬
		
		for(int i = 1 ; i< arr.length ; i++) {
				System.out.println(arr[i]); // 0번을 제외하고 출력.
		}
		br.close();
	}
}
	
