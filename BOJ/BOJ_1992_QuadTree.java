package Test;

import java.io.*;
import java.util.*;



public class Quad_Tree_BOJ1992 {
	
	public static int[][] map;
	public static StringBuilder sb = new StringBuilder();

	public static boolean isPossible(int x, int y, int n) { // 압축하여 표기할수있는지 확인.
		int value = map[x][y];
		
		for(int i = x; i < x + n; i++) {
			for(int j = y; j < y + n; j++) {
				if(value != map[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void Quad(int x, int y, int n) {
		if(isPossible(x, y, n)) {
			sb.append(map[x][y]); // 압축하여 표기할수있는경우 표기.
			return;
		}
		
		int size = n / 2;	// 압축이 불가능 할 경우 작은 사이즈로 나누어 계산
		
		sb.append('(');	
		
		Quad(x, y, size);	 // 좌상		
		Quad(x, y + size, size);	//우상			
		Quad(x + size, y, size);	//좌하	
		Quad(x + size, y + size, size);//우하
		
		sb.append(')');	
	}
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/QuadTree_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		
		for(int i = 0; i < N; i++) { // 배열에 입력값을 저장.
			String str = br.readLine();
			
			for(int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		Quad(0, 0, N);
		System.out.println(sb.toString());
	}
}

