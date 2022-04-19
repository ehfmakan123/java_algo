package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Sorting_BOJ10989 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		int[] arr = new int[10001]; // 0 ~ 10000
		System.setIn(new FileInputStream("res/Sorting_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// 카운팅 정렬을 위해 arr[10000] 배열에 데이터 입력
		for(int i= 0 ; i < N ; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < arr.length; i++) {
			while(arr[i] > 0) {
				sb.append(i).append("\n");
				arr[i]--;
			}
		}
		System.out.println(sb.toString());
	}
}

// counting 정렬을 이용하여 풀이 collections.sort 안됨
