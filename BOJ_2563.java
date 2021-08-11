package Test;

import java.io.*;
import java.util.*;
public class Confetii {
	public static void main(String[] args) throws Exception {
		
//첫째 줄에 색종이의 수가 주어진다. 이어 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다. 
//색종이를 붙인 위치는 두 개의 자연수로 주어지는데 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고, 
//두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다.
//색종이의 수는 100 이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다.

		System.setIn(new FileInputStream("res/input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int MAX = 101;
		boolean arr[][] =  new boolean [MAX][MAX]; //  배열 생성 boolean
		
		int T = Integer.parseInt(br.readLine());
		int res = 0; // 결과값 저장할 변수 선언
		
		for(int t = 0 ; t < T ; t++) { // 테스트 케이스 횟수만큼 반복
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken())-1;// x 좌표값
			int y = Integer.parseInt(st.nextToken())-1;// y 좌표값
			
			for( int i = x ; i < x+10 ; i++) {
				for(int j = y ; j < y+10; j++) {
					if(arr[i][j] == false) {
						arr[i][j] = true;   // 검은색으로 칠해지는 부분을 1으로 변경
						res++;
					}
				}
			}
		}
	sb.append(res);
	System.out.println(sb);
	br.close();
	}
}

