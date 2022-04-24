package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FactorialZero_BOJ1676 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int res = 0 ;

		while( N >= 5) { 
			res += N / 5;
			N /= 5;
		}
		System.out.println(res);
	}

}
