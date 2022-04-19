package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RemakeChess_BOJ1018 {
static int[][] arr;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res/RemakeChess_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		for(int i = 0 ; i< N ; i++) {
			String str = br.readLine();
			for(int j = 0 ; j < M ; j++) {
				arr[i][j] = str.charAt(j);  // 전체 배열에 입력
			}
		}
		int res = Integer.MAX_VALUE; // 결과값
		for(int i = 0 ; i< N-7 ; i++) {
			for(int j = 0 ; j < M - 7 ; j++) { // M*N 배열이지만 8*8 씩만 보면됨
				res = Math.min(res, find(i,j));// 바꿔야 하는 블록의 갯수 최솟값
			}
		}
		System.out.println(res);
	}

	private static int find(int x, int y) {
		// TODO Auto-generated method stub
		int B = 0; // 검은색 블록부터 시작할 때 바꿔야 하는 경우의 수
		int W = 0; // 흰색 블록부터 시작할 때 바꿔야 하는 경우의 수
		for(int i= x; i < x+8 ; i++) { 
			for(int j = y ; j < y+8 ; j++) { // 8*8 배열
				if((i+j)%2 == 0 ) { //시작점 기준
					if(arr[i][j] == 'W') { 
						B++;
					}else W++;
				}else {
						if(arr[i][j] == 'W') {
							W++;
						}else {
							B++;
						}
					}
				}
			}
		return Math.min(W, B);
	}

}

// 색칠하기 문제
