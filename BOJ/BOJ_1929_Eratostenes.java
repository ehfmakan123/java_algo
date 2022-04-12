package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Primenum_BOJ1929 {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int[] arr = new int [N+1];
		arr[1] = 1;
		
		for(int i = 2; i <= N ; i++) {
			if(arr[i] != 1) {
				for(int j =2 ; i*j <= N; j++ ) {
					arr[i*j] = 1;
				}
			}
		}
		for(int j = M ; j <=N ; j++) {
			if(arr[j] != 1) {
				System.out.println(j);
			}
		}
	}

}

// 
