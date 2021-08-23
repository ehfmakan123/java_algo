package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Alphabet_BOJ1987 {
	
	private static int R , C , res;
	private static char[][] map ;
	private static boolean[] chk;
	private static int[] dx = {-1,0,1,0};
	private static int[] dy = {0,1,0,-1};
	
	public static void dfs(int x,  int y ,int cnt ) { // 시작위치 , 진행 카운트 값(깊이)
		if(chk[map[x][y]]) {
			res = Math.max(res,cnt);
			return;
		}else {
			chk[map[x][y]] = true; // 해당 알파벳을 true (사용)
			for(int i = 0 ; i < 4; i++) {
				int nx = x +dx[i];
				int ny = y +dy[i];
				
				if(nx < 0 || ny  < 0 || nx > R-1 || ny > C-1) // 이동하려는 곳이 범위를 벗어나는지 체크
					continue; // 벗어나면 다음 반복.
				dfs(nx,ny,cnt+1); // 범위 안이면 cnt +1 후 다음 위치에서 재귀호출
			}
			chk[map[x][y]] = false; // 배열 초기화.
		}
	}
	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("res/Alphabet_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		R = Integer.parseInt(st.nextToken()); // 입력 받은 값들을 저장.
		C = Integer.parseInt(st.nextToken());
		map = new char [R][C]; 
		chk = new boolean[26]; // 지나간 알파벳을 저장할 chk 배열 (알파벳 26개)
		
		for(int i = 0 ; i < R ; i ++) {
			String str = br.readLine();
			for(int  j = 0 ; j < C ; j++) {
				map[i][j] =  (char) (str.charAt(j)-'A'); // 받은 알파벳 입력값을 숫자로 바꾼뒤 계산하기 위해 치환
			}
		}
		
		res = 1 ; // 결과값 저장할 변수 초기화.  자기자신을 기본으로 갖고 시작.
		dfs(0,0,0);
		System.out.print(res); // 결과값을 출력.
		br.close();
	}

}
