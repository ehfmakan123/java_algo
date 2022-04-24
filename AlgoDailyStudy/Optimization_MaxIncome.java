package Optimization;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxIncome {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int [N];
		st = new StringTokenizer(br.readLine());
		for(int i =0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int res = 0 , sum = 0; 
		
		for(int i = 0; i < K ; i++) {
			sum += arr[i];
		}
		res =sum;
		
		for(int i = K ; i < N ;i++) {
			sum += arr[i] - arr[i-K] ;
			res = Math.max(res, sum);
		}
		System.out.println(res);
	}

}
