package Optimization;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProgressSum {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N/2+1];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i+1;
		}
		int res =0 , sum = 0 ,lt = 0  ;
		for(int rt= 0 ; rt < arr.length ; rt++) {
			sum += arr[rt];
			if(sum == N)  {
				res++;
			}
			while(sum >= N) {
				sum -= arr[lt];
				lt++;
				if(sum == N) {
					res++;
				}
			}
		}
		System.out.println(res);
	}

}
