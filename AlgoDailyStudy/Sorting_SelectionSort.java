package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SelectionSort {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N  = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		
		for(int i = 0 ; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0 ; i < N -1 ; i++) {
			int idx = i ; // 최솟값 넣을 idx 
			for(int j = i + 1 ; j < N ;j++) {
				if(arr[j] < arr[idx] )  idx = j; // 기준값 arr[idx] 보다 작으면 idx 바꿔줌
			}
			int tmp = arr[i] ;
			arr[i] = arr[idx];
			arr[idx] = tmp; 
		}
		
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

}
