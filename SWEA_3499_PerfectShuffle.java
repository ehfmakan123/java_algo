import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
	System.setIn(new FileInputStream("res/Perfect_shuffle_input.txt"));
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼드 리더 생성
	StringBuilder sb = new StringBuilder(); // 스트링 빌더 생성 띄워쓰기로 초기화 
	
	int N = Integer.parseInt(br.readLine()); // 전체 testcase의 숫자를 받음.
	
	for( int tc = 1 ; tc <=N ; tc++) { // testcase
		sb.append("#").append(tc).append(" ");
		int num = Integer.parseInt(br.readLine());
		String[] left = new String[(num/2) +1]; // 짝수배열
		String[] right = new String[(num/2) +1]; // 홀수배열
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int c = num/2;   // 중간값
		
		int idx = 0; 
		
		for(int i = 0 ; i < num ; i++) {
			if( i == num/2 && num % 2 == 1) { // num이 홀수일 경우 중간값을 왼쪽 배열으로 정리
				left[i] = st.nextToken();
			}else if(i < num/2){
				left[i] = st.nextToken();				
			}else
				right[idx++] = st.nextToken();
		}
		for(int i = 0 ; i < num/2 ; i++) {
			sb.append(left[i]).append(" ").append(right[i]).append(" ");
		}if( num % 2 == 1) { // num 이 홀수일 경우 정리했던 중간값을 추가로 넣어줘야함 안하면 안나옴
			sb.append(left[num/2]);
		}
		sb.append("\n");
		}
		System.out.println(sb);
	}
}

