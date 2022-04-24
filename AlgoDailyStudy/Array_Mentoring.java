package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mentoring {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int [M][N];
		
		for(int i = 0 ; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int res = 0 ;
		for(int i = 1 ; i <= N ; i++) { // 인원수 짝을 맞추기 위함 ( N * N )
			for(int  j= 1; j <= N ; j++) { // 인원수 짝을 맞추기 위함 ( N * N )
				int cnt = 0 ;
				for(int k = 0 ; k < M; k++) { // test 의 갯수.
 					int pi = 0 , pj = 0 ; // 등수 초기화
					for(int s = 0 ; s < N ;s++) {
						if(arr[k][s] == i) pi = s;
						if(arr[k][s] == j )pj = s;
					}
					if(pi < pj) {
						cnt++;
					}
				}if(cnt == M) { // M 번의 카운팅 후 모든 케이스에서 가능하다면
					res++; // 결과값 ++;
				}
			}
		}
		System.out.println(res);
	}

}
