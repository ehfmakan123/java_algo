package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MapMaxSum {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][N];
		int res = 0 ;
		
		for(int i = 0 ; i < N ; i++) {
			int sum = 0 ;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int sum1 , sum2;
		
		for(int i = 0 ; i < N ;i++) {
			sum1 = sum2 =  0 ;
			for(int j = 0 ; j < N ;j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			res = Math.max(res, sum1);
			res = Math.max(res, sum2);
		}
		
		sum1 = sum2 = 0 ;
		for(int i = 0 ; i < N ; i++) {
			sum1 += arr[i][i]; 
			sum2 += arr[i][N-i-1];
		}
		res = Math.max(res, sum1);
		res = Math.max(res, sum2);
		
		System.out.println(res);
	}

}
