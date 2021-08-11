package Test;

import java.io.*;
import java.util.*;

public class Array_turn3 {
	
	static int N ;
	static int M;
	static int R;
	static int[][] arr;
	
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/Arrayturn3_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M]; // N * M 배열
		
		for(int i = 0 ; i < N ; i++ ) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0 ; j < M ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		} // 초기값 설정
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 1 ; i <=R ; i++) {
			int key  = Integer.parseInt(st.nextToken());
			switch (key) {
				case 1:
					first();
					break;
				case 2:
					second();
					break;
				case 3:
					third();
					break;
				case 4:
					fourth();
					break;
				case 5:
					fifth();
					break;
				case 6:
					sixth();
					break;		
			}
		}
	
	for(int i = 0 ; i <N ; i++) {
		for(int j = 0 ; j < M ; j++) {
			System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		br.close();
		}
	}// Main 메서드 종료.
	
	public static void first() {
		for(int i = 0 ; i < (N/2)  ; i++) { // 상하반전은 반만 돌리면됨. 홀수일 경우 중간에 반전 X 이므로 고려 X
			for( int j = 0 ; j < M ; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[N-i-1][j];
				arr[N-i-1][j] = temp;
			}
		}
	} 
	
	public static void second() {
		for(int i = 0 ; i < N  ; i++) { // 좌우반전은 반만 돌리면됨. 홀수일 경우 중간에 반전 X 이므로 고려 X
			for( int j = 0 ; j < (M/2) ; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][M-j-1];
				arr[i][M-j-1] = temp;
			}
		}
	}
	public static void third() {
		int[][] tmp = new int [M][N];  // M * N 배열
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j< M ; j++) {
				tmp[j][N-1-i] = arr[i][j];
			}
		}
			int temp = M;
			M = N;
			N = temp;
			arr = tmp;
	}
	public static void fourth() {
		int[][] tmp = new int [M][N];  // M * N 배열
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j< M ; j++) {
				tmp[M-1-j][i] = arr[i][j];
			}
		}
			int temp = M; 
			M = N;
			N = temp;
			arr = tmp; // arr 주소값 변경.
	}
	public static void fifth() {
		for(int i = 0 ; i  < N/2 ; i++) {
			for(int j= 0 ; j < M/2 ; j++) {
				int temp = arr[N/2+i][j];
				arr[N/2+i][j] = arr[N/2+i][M/2+j];
				arr[N/2+i][M/2+j] = arr[i][M/2+j];
				arr[i][M/2+j] =arr[i][j];
				arr[i][j] = temp;
			}
		}
	}
	public static void sixth() {
		for(int i = 0 ; i  < N/2 ; i++) {
			for(int j= 0 ; j < M/2 ; j++) {
				int temp = arr[N/2+i][j];
				arr[N/2+i][j] = arr[i][j];
				arr[i][j] = arr[i][M/2+j];
				arr[i][M/2+j] = arr[N/2+i][M/2+j];
				arr[N/2+i][M/2+j] = temp;
			}
		}
	}

}





