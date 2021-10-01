package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SpecificMagnetic_SWEA4013 {
	static int[] gear1 ; // 각 기어를 저장해줄 배열 선언.
	static int[] gear2 ;
	static int[] gear3 ;
	static int[] gear4 ;
	static boolean[] chk;
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/SpecificMagnetic_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1 ; tc <= T ;tc++) { // 테스트 케이스 돌리기
			sb.append("#"+tc+" ");
			int res = 0 ;// 결과값 저장 변수.
			int K = Integer.parseInt(br.readLine()); // 전체 기어 돌아가는 횟수.
			gear1 = new int [8];
			gear2 = new int [8];
			gear3 = new int [8];
			gear4 = new int [8];
			chk = new boolean[4]; // 기어가 한번 돌아갔는지 체크하기 위한 chk 배열
			for(int i = 0 ; i < 4 ; i++) {
				st = new StringTokenizer(br.readLine()," ");
				for(int j = 0 ; j < 8 ;j++) { // 각 기어의 NS값 저장.
					if(i == 0) gear1[j] = Integer.parseInt(st.nextToken());
					if(i == 1) gear2[j] = Integer.parseInt(st.nextToken());
					if(i == 2) gear3[j] = Integer.parseInt(st.nextToken());
					if(i == 3) gear4[j] = Integer.parseInt(st.nextToken());
				}
			}
			for(int i = 0 ; i < K ; i++) {
				st = new StringTokenizer(br.readLine()," ");
				int gnum = Integer.parseInt(st.nextToken()); //기어의 번호 저장
				int dir = Integer.parseInt(st.nextToken());	// 기어가 돌아가는 방향 저장.
				turn(gnum,dir); // 기어를 돌리는 함수 turn.
				chk = new boolean[4]; // 명령을 1회 수행한 후 기어들의 방문선언을 초기화
			}
			res = gear1[0] + gear2[0]*2 + gear3[0]*4 + gear4[0]*8 ; // 각 결과값 더하기
			sb.append(res+"\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
	private static void turn(int gnum, int dir) {
		switch (gnum) { // 기어의 번호에 맞게 switch
		case 1:
			if(chk[0]) break; // 방문여부 확인 후 방문 했다면 break;(무한루프 방지) 
			chk[0] = true; // ( 방문여부 체크)
			
			if(gear1[2] != gear2[6]) {
				turn(2,dir*(-1)); // (맞물린 기어가 있다면 해당 기어를 turn(반대방향) 
			}
			if(dir == 1) { // 기어를 시계방향으로 회전
				int temp = gear1[7];
				for(int i = 7 ; i >0  ;i--) {
					gear1[i] = gear1[i-1];
				}
				gear1[0] = temp;
			}else { // 기어를 반시계 방향으로 회전.
				int temp = gear1[0];
				for(int i = 0 ; i < 7 ; i++) {
					gear1[i] = gear1[i+1];
				}
				gear1[7] = temp;
			}
			break;
		case 2: // 나머지 케이스는 1번과 크게 다르지 않음.
			if(chk[1]) break;
			chk[1] = true;
			if(gear2[2] != gear3[6]) {
				turn(3,dir*(-1));
			}
			if(gear1[2] != gear2[6]) {
				turn(1,dir*(-1));
			}
			if(dir == 1) {
				int temp = gear2[7];
				for(int i = 7 ; i >0  ;i--) {
					gear2[i] = gear2[i-1];
				}
				gear2[0] = temp;
			}else {
				int temp = gear2[0];
				for(int i = 0 ; i < 7 ; i++) {
					gear2[i] = gear2[i+1];
				}
				gear2[7] = temp;
			}
			break;
		case 3:
			if(chk[2]) break;
			chk[2] = true;
			if(gear3[2] != gear4[6]) {
				turn(4,dir*(-1));
			}
			if(gear2[2] != gear3[6]) {
				turn(2,dir*(-1));
			}
			if(dir == 1) {
				int temp = gear3[7];
				for(int i = 7 ; i >0  ;i--) {
					gear3[i] = gear3[i-1];
				}
				gear3[0] = temp;
			}else {
				int temp = gear3[0];
				for(int i = 0 ; i < 7 ; i++) {
					gear3[i] = gear3[i+1];
				}
				gear3[7] = temp;
			}
			break;
		case 4:
			if(chk[3]) break;
			chk[3] = true;
			if(gear3[2] != gear4[6]) {
				turn(3,dir*(-1));
			}
			if(dir == 1) {
				int temp = gear4[7];
				for(int i = 7 ; i >0  ;i--) {
					gear4[i] = gear4[i-1];
				}
				gear4[0] = temp;
			}else {
				int temp = gear4[0];
				for(int i = 0 ; i < 7 ; i++) {
					gear4[i] = gear4[i+1];
				}
				gear4[7] = temp;
			}
			break;
		}
	}
}
