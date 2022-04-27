package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MusicVideo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr =new int[N];
		
		st = new StringTokenizer(br.readLine());
		int max = -1;
		int sum = 0 ;
		for(int i = 0 ; i < N ;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			Math.max(arr[i], max);
			sum += arr[i];
		}
		int res = 0 ;
		int lt = max , rt = sum;
		while(lt <= rt) {
			int mid = (lt+rt)/2;
			if(count(arr , mid) <= M) {
				res = mid;
				rt = mid - 1;
			}else {
				lt = mid + 1;
			}
		}
		System.out.println(res);
	}

	private static int count(int[] arr, int key) {
		// TODO Auto-generated method stub
		int cnt = 1, sum = 0 ;
		for(int x : arr) {
			if(sum + x > key) {
				cnt++;
				sum = x; // 이전값을 비우고 방금 들어온 x를 sum 에다 넣어줌
			}
			else sum += x;
		}
		return cnt;
	}

}
