package Optimization;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class CommonElement {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> ans = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int M = Integer.parseInt(br.readLine());
		int[] arr2 = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < M ;i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		Arrays.sort(arr2);
		int p1 = 0 , p2 = 0 ;
		
		while(p1 < N && p2 < M) {
			if(arr[p1] == arr2[p2]) {
				ans.add(arr[p1++]);
				p2++;
			}else if(arr[p1] < arr2[p2]) p1++;
			else p2++;
		}
		for(int x : ans) {
			System.out.print(x+" ");
		}
	}

}
