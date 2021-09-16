//BOJ_3040

import java.io.*;
import java.util.*;

public class White_Snow {
	static int N = 9 ;
	static int N2 = 7;
	static int[] arr = new int[N];
	static int[] arr2 = new int[N2];
	static boolean[] isSelected ;
	static StringBuilder sb =new StringBuilder();
	public static void main(String[] args)throws Exception{
		//System.setIn(new FileInputStream("res/White_Snow_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		comb(0,0);
		System.out.print(sb.toString());
		br.close();
	}
	private static void comb(int cnt,int start){
		if(cnt == N2) { // 카운트가 7일 경우 안에있는 원소들의 합을 구한다.
			int sum = 0; // 원소들의 합 sum
			for(int i = 0 ; i < arr2.length ; i++) { // 0 ~ 6 까지 7개의 원소의 합을 sum 에 넣음
				sum += arr2[i];
			}if(sum == 100) { // sum이 100일 경우.
				for(int i = 0;i < arr2.length ; i++) {
					//System.out.println(arr2[i]); // sum == 100 을 만족하는 원소들을 출력.
					sb.append(arr2[i]).append("\n"); // stringbuilder에 원소들을 넣음.
				}
			}

			return;
		}
		
		for(int i = start ; i<arr.length ; i++) { //재귀 호출.
			arr2[cnt] = arr[i];
			comb(cnt+1,i+1);
		}
	
	}
}
