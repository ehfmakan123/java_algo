//SWEA_6808

import java.io.*;
import java.util.*;
public class Main {
	private static int win,lose;
	private static int[] Gyu_arr, In_arr ,temp;
	private static boolean[] chk,isSelected;
	
	private static void permutation(int cnt) {
		if(cnt == 9) {
			int x = 0 ; int y = 0;
			for(int i = 0 ;i < 9 ;i++) {
				if(Gyu_arr[i] > temp[i]) {
					x += Gyu_arr[i] + temp[i];
				}else
					y += Gyu_arr[i] +temp[i];
			}
			if( x > y){
				win ++;
			}else if(x < y) {
				lose ++;
			}
				return;
		}
		for( int  i = 0 ; i< 9 ;i++) {
			if(isSelected[i]) continue;	
			
			temp[cnt] = In_arr[i];
			isSelected[i] = true;
			permutation(cnt+1);
			isSelected[i] = false;
		}
	}

	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("res/Card_game_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // stringbuilder 객체 생성
		int T = Integer.parseInt(br.readLine());  // 테스트 케이스의 수를 입력 받음.
		
		for(int tc = 1 ; tc <= T ; tc++) { // 테스트 케이스 만큼 돌림
			Gyu_arr = new int [9]; //입력 받는 숫자 배열
			In_arr = new int [9]; // 상대의 숫자 배열
			temp = new int[9];
			chk = new boolean[19]; // 체크 확인(숫자가 1부터 사용되므로 18+1 까지 배열생성)
			isSelected = new boolean[19]; 
			
			win = 0 ;
			lose = 0;	
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int i = 0 ; i< 9 ; i++) {
				Gyu_arr[i] = Integer.parseInt(st.nextToken()); // 하나씩 배열에 넣음
				chk[Gyu_arr[i]] = true;	 // 넣은 배열에 들어간 값을 체크함.
			}
			
			int cnt = 0;
			for(int i = 1 ; i <= 18 ; i++) {
				if(!chk[i]) {
					In_arr[cnt++] = i; // 1~ 18중 입력값이 아닌 값들을 arr2에 저장 ( chk 배열을 이용)
				}
			}
			permutation(0);
			sb.append("#").append(tc).append(" ").append(win).append(" ").append(lose).append("\n"); // 기본 베이스 sb.append();
		}
		System.out.print(sb);
		br.close();
	}
}
