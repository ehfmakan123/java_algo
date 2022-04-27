package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DecideStall {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int[ ] arr =new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int res = 0 ;
		Arrays.sort(arr);
		
		int lt = 1; // 일단 1으로 초기화
		int rt = arr[N-1]; // 최댓값으로 초기화
		
		while(lt <= rt) { 
			int mid = (lt+rt)/ 2;
			if(count(arr,mid) >= C) { // 목표값보다 크면
				res = mid; // 일단 res 에 방금 구한 mid 값 저장
				lt = mid+1; // lt 를 mid+ 1 로 해서 다시 탐색
			}else {
				rt = mid -1; // rt 를 mid-1 로 해서 재탐색
			}
		}
		System.out.println(res);
	}

	private static int count(int[] arr, int dist) {
		// TODO Auto-generated method stub
		int cnt = 1;  //넣은 말의 마리수
		int ep = arr[0]; // 첫번째 좌표로 초기화 (방금 넣은 말 위치값)
		for(int i = 1 ; i < arr.length ; i++) { 
			if(arr[i] - ep >= dist) { // 탐색하는 위치와 최근 넣ㅇ은 말의 위치 비교해서 mid 보타 크면
				cnt++; // 말 한마리 더 넣고
				ep = arr[i]; // 방금 넣은 말을 최근 값에 입력
			}
		}
		return cnt;
	}

}
