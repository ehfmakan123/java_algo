package Recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci {
static int[] fib ;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		fib = new int[N+1]; // memoization용 배열
		fib(N);
		
		for(int i = 1 ; i <= N ; i++) {
			System.out.print(fib[i]+" ");
		}
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(fib[n] > 0) { // 이미 구한수인경우 ( memo한 경우 값을 출력)
			return fib[n];
		}
		if(n <= 2) {
			return fib[n] = 1;
		}else {
			return fib[n] = fib(n-2) + fib(n-1);
		}
	}

}
