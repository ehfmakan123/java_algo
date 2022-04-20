package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KingdomKnight {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int C = str.charAt(0) -'a' + 1; // 열
		int R = str.charAt(1)-'0'; // 행
		
		int[] dx = {-2,-1,1,2,2,1,-1,-2};
		int[] dy = {-1,-2,-2,-1,1,2,2,1};
		
		int res = 0 ;
		for(int i = 0 ; i< 8 ; i++) { // 전체탐색
			int nR = R +dx[i];
			int nC = C +dy[i];
			if(nR >= 1 && nR <= 8 && nC >= 1 && nC <= 8) { // 시행 후 위치가 범위를 넘지 않을때
				res++;
			}
		}
		System.out.println(res);
	}

}
