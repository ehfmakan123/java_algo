package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Decompose_BOj2231 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int len = String.valueOf(N).length(); 
		int res = 0 ;
		for(int i = N - len*9 ; i< N ; i++) { // 생성자 최소 조건 ~ N
			int num = i;	
			int sum = 0 ;
			while(num != 0 ) { 
				sum += num % 10; // 각 자리수 더하기 (뒤에서 부터)
				num /= 10;
			}
			if(sum + i == N ) { // 각 자리수더한값 + i 가 N 일 경우(i가 생성자일 경우)
				res = i; // 작은 생성자 우선 검색
				break;
			}
		}
		System.out.println(res);
	}

}

// 문제가 헷갈림 
