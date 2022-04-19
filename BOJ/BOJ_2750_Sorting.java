package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sorting_BOJ2750 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res/Sorting_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int [N];
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		for(int i = 0 ; i< N ;i++) {
			System.out.println(arr[i]);
		}
	}

}

//간단한 정렬 문제 의도는 소팅 구현이었던거 같은데... 
