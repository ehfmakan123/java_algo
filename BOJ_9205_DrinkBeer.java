package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DrinkBeer_BOJ9205 {

	private static int T  ;
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/DrinkBeer_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine()); // 테스트 케이스의 숫자.
		StringTokenizer st ;
		
		for(int tc = 1 ; tc <= T ; tc++) {
			
			int N = Integer.parseInt(br.readLine()); // 편의점의 갯수
			int[] x = new int [N+2]; // 집 , 편의점 , 락 페스티벌 각각의 위치 저장 배열 (편의점 갯수 +2)
			int[] y = new int [N+2]; // 집 , 편의점 , 락 페스티벌 각각의 위치 저장 배열
			boolean[][] map = new boolean[N+2][N+2];  // 지정 위치로 갈수있는지 없는지 여부를 확인할 배열
			
			
			for(int i = 0 ; i <N+2 ; i++) { // 순서대로 집 편의점1 ,편의점 2, .... , 편의점 N , 락페스티벌 위치 입력
				st = new StringTokenizer(br.readLine());
				x[i] = Integer.parseInt(st.nextToken());
				y[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i = 0 ; i< N +2 ;i++) {
				map[i][i] = true; // 자기자신으로 갈수있음 
				for(int j = i+1 ; j < N +2 ;j++) {
					int d = Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[j]);  // 선택 index 와 이후의 index의 거리를 저장
					if(d <= 1000) { // 맥주 20병 * 50 = 1000 맥주를 다 마시기 전에 갈 수 있으면 갈수있음으로 표시!!
						map[i][j] = map[j][i] = true; // 갈수있어!!!!
					}
				}
			}
			// 플로이드  알고리즘
			for(int i=0; i<N+2; i++){
				for(int j=0; j<N+2; j++){
					for(int k=0; k<N+2; k++){
						if(map[j][i] && map[i][k]) // 거쳐서 갈수있는지를 알아볼 수 있음 
							map[j][k] = true;
					}
				}
			}
			System.out.println(map[0][N+1] ? "happy" : "sad"); // 이동 가능하면 happy 아니면 sad
		}
		br.close();
	}
}
