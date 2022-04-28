package Recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class recursion {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		recur(N);
	}

	private static void recur(int n) {
		if(n == 0) {
			return ;
		}else {
			recur(n-1);
			System.out.print(n+" ");
		}
	}

}
