package Recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N  = Integer.parseInt(br.readLine());
		System.out.println(fac(N));
	}

	private static int fac(int n) {
		// TODO Auto-generated method stub
		if(n == 1) { // 종료조건 ( n 이 1이면 끝)
			return 1;
		}else {
			return n*fac(n-1); // 1보다 크면 N * factorial (N-1) 리턴
		}
	}

}
