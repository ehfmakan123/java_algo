package Optimization;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProgressSum2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int res =0 , cnt = 1; // cnt = 연속된 자연수의 갯수
		N--; 
		while(N > 0) {
			cnt++; 
			N -= cnt;
			if(N%cnt == 0) { // 목표수에서 연속된 자연수의  갯수 까지의 (1 ~ cnt 합) 합을 뺀 다음
				res++; 	// cnt 로 나누면 연속된 자연수로 나눌 수 있는지 없는지 판별이 가능하다!!!!
			}
		}
	}

}

//수학적으로 풀이 가능한 방법!!
