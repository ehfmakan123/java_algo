package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Ranking {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer  st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0 ; i < N ;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0 ; i < N ; i++) {
			int cnt = 1 ;
			for(int j = 0 ; j < N ; j++) {
				if(arr[i] < arr[j]) {
					cnt++;
				}
			}
			System.out.print(cnt+" ");
		}
	}
}
