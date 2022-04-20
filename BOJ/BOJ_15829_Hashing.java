package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hashing_BOJ15829 {
	static int mod = 1234567891;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long sum = 0 ;
		long key = 1;
		String str = br.readLine();
		
		for(int i = 0 ; i < N ; i++) {
			sum += ((str.charAt(i)-96)*key)%mod	;
			key = (key*31) % mod;
		}
		System.out.println(sum%mod);
	}

}

//자료형 변환 , 표현 가능 값 범위 , 분할 연산
