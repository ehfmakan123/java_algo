package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HeightRank_SWEA {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("res/HeightRank_input.txt")); // input 을 불러와서 읽어줌
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1 ; tc <= T ; tc++) { // T만큼의 테스트 케이스.
			int res = 0;
			int INF = 987654321;
			sb.append("#"+tc+" ");
			int N = Integer.parseInt(br.readLine());
			int M = Integer.parseInt(br.readLine());
			int[][] arr =new int[N][N];
			
			
			for(int i = 0 ; i< N ; i++) { // arr 배열을 플로이드 워셜을 사용하기 위한 초기화작업
				for(int j = 0 ; j< N ; j++) {
					arr[i][j] = i == j ? 0 : INF;
				}
			}
			
			for(int i  = 0 ; i< M; i++) {
				st =new StringTokenizer(br.readLine());
				arr[Integer.parseInt(st.nextToken())-1][Integer.parseInt(st.nextToken())-1] = 1; // 학생이 1번 부터이므로..
			}
			
			
			// 플로이드 워셜 알고리즘 사용.
			for(int k = 0 ; k < N ; k++) {
				for(int i = 0 ; i < N ; i++) {
					if(k == i)  continue;
					for(int j = 0 ; j < N ; j++) {
						if(k == j || i ==j) continue;
						if(arr[i][j] > arr[i][k] + arr[k][j]) {
							arr[i][j] = arr[i][k] + arr[k][j];
						}
					}
				}
			}
			for(int i = 0 ; i < N ; i++) {
				boolean chk = true;
				for(int j = 0 ; j < N ; j++) {
					if(arr[i][j] == INF && arr[j][i] == INF) {
						chk = false;
						break;
					}
				}
				if(chk) res++;
			}
			sb.append(res).append("\n");
		}
		br.close();
		System.out.println(sb.toString());
	}
}
