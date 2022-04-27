package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Rascal {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0 ;i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] temp = arr.clone();
		Arrays.sort(temp);
		for(int i = 0 ; i< N ; i++) {
			if(arr[i] != temp[i]) {
				System.out.print((i+1)+" ");
			}
		}
	}

}
