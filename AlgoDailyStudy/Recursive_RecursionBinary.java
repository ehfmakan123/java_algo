package Recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RecursionBinary {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		rec(N);

	}

	private static void rec(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {  // 종료조건
		}else {
			rec(n/2);
			System.out.print(n%2);
		}
	}

}
