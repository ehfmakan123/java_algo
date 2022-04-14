package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FibonacciNumber5_BOJ1087 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(fib(N));
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else {
			return fib(n-1) + fib(n-2);
		}
	}

}

//간단한 피보나치 수열 
