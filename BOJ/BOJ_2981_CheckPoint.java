package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2981_CheckPoint {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr =new int[N];
		
		for(int i = 0 ; i < N ;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int key = arr[1] - arr[0]; // Math.abs() 로 해도됨. 
		
		for(int i = 2; i < N ; i++) {
			key = gcd2(key , arr[i] - arr[i-1]);
		}
		
		for(int i =2 ; i <= key/2 ; i++) {
			if(key % i == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println(key);
	}

	private static int gcd(int a, int b) { // 유클리드 호제법 (반복문)
		while(b != 0) {
			int r = a % b;
			a = b; 
			b = r ;
		}
		return a;
	}
	
	private static int gcd2(int a , int b) { // 유클리드 호제법 (재귀)
		if(b==0) {
			return a;
		}else {
			int r = a % b;
			return gcd2(b,r);
		}
		
	}

}
