package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BinarySearch {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N =Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr =new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
//		HashMap<Integer, Integer>  hm = new HashMap<>();
//		for(int i = 0 ; i< N ;i++) {
//			int key  = arr[i];
//			hm.put(key, i+1);
//		}
//		System.out.println(hm.get(M));
		// hashmap 사용시 100~150ms -> O(N)
		
		int res = 0;
		int lt = 0, rt = N-1;
		
		// 이분탐색이 더 빠름 O(logN)
		while(lt <= rt) {
			int mid = (lt+rt) /2;
			if(arr[mid] == M) {
				res = mid +1 ;
				break;
			}
			if(arr[mid] > M) {
				rt = mid - 1;
			}else {
				lt= mid +1;
			}
		}
		System.out.println(res);
	}

}
