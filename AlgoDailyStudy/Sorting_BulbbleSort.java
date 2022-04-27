package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BublleSort {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0 ; i < N ;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0 ; i < N-1 ;i++) { //  턴의 횟수
			int idx = i ;
			for(int  j = 0 ; j < N-i-1 ;j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

}
