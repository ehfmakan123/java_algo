package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Uphillroad_BOJ2846 {
	static int res, N ;
	static int[] arr;
	static boolean chk;
	public static void main(String[] args) throws Exception{
	//	System.setIn(new FileInputStream("res/Uphill_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		res = 0 ;
		search();
		br.close();
		System.out.print(res);
	}
	private static void search() {
		int sum = 0 ;
		for(int i = 0 ; i < N-1 ;i++) {
			if(arr[i] < arr[i+1]) {
				sum += arr[i+1] - arr[i];
				if(i == N-2) {
					res = Math.max(res,sum);
				}
			}else {
				res = Math.max(res,sum);
				sum = 0;
			}
		}
	}
}
