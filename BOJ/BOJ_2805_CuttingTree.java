package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TreeCutting_BOJ_2805 {
static int N , M ,max, min;
static int arr[];
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub	
//		System.setIn(new FileInputStream("res/TreeCutting_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		
		
		
		for(int i = 0 ; i <  N  ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
//			max = Math.max(max, arr[i]);
		}
		Arrays.sort(arr);
		
		min = 0;
		max = arr[N-1];
		
		while( min < max) { // 2분 탐색
			int mid = (min + max) / 2;
			long sum = 0 ; // 현재 자른 나무들의 합
			for(int x : arr) { // 각 나무들
				if( x - mid > 0) { // 자른 값이 양수이면 (음수는 불가)
					sum += x - mid; // 자른 나무의 합을 sum 에 더한다.
				}
			}
			
			if( sum < M) { // 목표값에 모자라면 max 값을 줄임  (범위 줄임)
				max = mid;
			}else {
				min = mid + 1; // 목표값보다 작거나 같으면 min 값 늘임 (범위 줄임)
			}
		}
		
		
		System.out.println(min - 1); //min max 가 바뀌는 순간 -> 직전까지가 최대로 가능한 값
	}
}
