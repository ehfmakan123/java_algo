package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ErroeCorrect_JO1037 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/ErrorCorrect_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] map = new int [4][4];
		StringTokenizer st ;
		for(int i = 0; i < N ; i++) {
			st =new StringTokenizer(br.readLine()," ");
			for(int j = 0 ; j <N ; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int x = 0 , y = 0 ;;
		int cnt1 = 0 ;
		int cnt2 = 0 ;
		boolean chk = false;
		//가로
		for(int i = 0 ; i < N ; i++) {
			int sum = 0;
			for (int j = 0; j < N; j++) {	
				sum += map[i][j];
			}
			if(sum % 2 != 0) {
				chk = true;
				y = i ;
				cnt1++;
			}
		}
		//세로
		for(int i = 0 ; i < N ; i++) {
			int sum = 0;
			for (int j = 0; j < N; j++) {	
				sum += map[j][i];
			}
			if(sum % 2 != 0) {
				chk = true;
				x = i;
				cnt2++;
			}
		}
		if(!chk){
			System.out.println("OK");
		}else if(chk && (cnt1 == cnt2)){
			System.out.print("change bit ("+(y+1)+","+(x+1)+")");
		}else {
			System.out.println("Corrupt");
		}	
		br.close();
	}
}

