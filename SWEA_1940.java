//swea 1940
import java.io.*;
import java.util.*;

public class Rc_Car {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input.txt")); // input 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 입력
		
		for(int tc = 1 ; tc <= T ; tc++) {
			sb.append("#").append(tc).append(" "); // stringbuilder로 출력 할거임!
			
			int N  = Integer.parseInt(br.readLine()); // 2번째줄 정수 N입력
			int res = 0 ; // 결과값
			int v = 0; // 속도
			
			for( int i = 0 ; i < N ; i++) {
				String str = br.readLine(); // 1줄 읽어서
				StringTokenizer st = new StringTokenizer(str); // 토크나이저에 넣고
				int c = Integer.parseInt(st.nextToken()); // 하나식 자를거야
				
				switch(c) { // 첫번째 읽은 애가 0 , 1, 2
				case 0: // 0이면 변화 x
					break;
				case 1: // 1이면 그다음 받는 값만큼 속도를 +
					v += Integer.parseInt(st.nextToken()); 
					break;
				case 2: // 2면 그다음 받는 값만큼 속도를 -
					v =+ Integer.parseInt(st.nextToken());
					break;
				}
				if(v<0) { // 중간에 속도가 음수가 되면 0으로 초기화
					v=0;
				}
				res += v; // 어차피 입력은 N번 이고 커맨드도 N개 이기 때문에 그냥 속도만 더해주면 속도*시간 = 거리가 됨
			}
			sb.append(res).append("\n");
		}
		System.out.println(sb);
	}
}
