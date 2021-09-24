package Algo;

import java.io.*;
import java.util.*;

public class Spot_Mart {
	public static void main(String[] args) throws Exception {
	System.setIn(new FileInputStream("res/Spot_input.txt"));
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder sb =new StringBuilder();
	
	int TC = Integer.parseInt(br.readLine());
	
	for(int t = 1; t <= TC ; t++ ) { // 테스트 케이스를 도랑요
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb.append("#").append(t).append(" ");
		
		int N = Integer.parseInt(st.nextToken()); // 과자의 갯수
		int M = Integer.parseInt(st.nextToken());// 과자 중량 
		
		int[] arr = new int[N]; // 결과값을 출력할 배열 생성
		int res = -1; // 결과값 ( default = -1)
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < N ; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
		for(int i = N - 1; i >0 ; i--){
			for(int j = i - 1 ; j >=0 ; j-- ) {
				if(arr[i] + arr[j] <= M && res < arr[i] + arr[j]){ // 한계값보다 작은 최대값 찾기
					res = arr[i] + arr[j] ;
					if( res == M) { // 결과값이 MAXIMUM일때 바로 break;
						i = -1;
						j = -1;
						}
					}
				}
			}
			sb.append(res).append("\n");
		}
	System.out.println(sb);
	br.close();
	}
}





