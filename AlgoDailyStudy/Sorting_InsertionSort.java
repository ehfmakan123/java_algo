package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class InsertionSort {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr =new int[N];
		for(int i = 0 ; i <N ;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int  i = 1 ; i< N; i++) {
			int tmp = arr[i] ; int j ;
			for(j = i -1 ; j >=0 ; j--) {
				if(arr[j] > tmp) {
					arr[j+1] = arr[j];
				}else {
					break;
				}
			}
			arr[j+1] = tmp;
		}
		for(int i = 0 ; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
