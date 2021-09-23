package Test;

import java.util.Arrays;

public class LIS_Test {
	public static void main(String[] args) {
		int[] arr = { 3,5,7,9,2,1,4,8}; // 사용할 배열
		int[] result = new int [arr.length]; // 출력 배열
		
		int ans = 0 ; // 최장증가 부분수열 길이
		for(int i = 0 ; i < arr.length ; i++) {
			int len = 0 ; // 부분수열의 길이
			for(int j = 0 ; j  < i ; j++) {
				if(arr[j] < arr[i]) { // 이전의 값들과 비교하여 최대길이의 부분수열이 되는지 판단
					len = Math.max(len, result[j]); // 이전값들 보다 클 경우 마지막에 붙여서 더 긴 부분수열을 만들 수 있다.
					// 따라서 len를 기존의값과 result[j] 중 최대값을 저장.
				}
			}
			result[i] = len +1; // 이전값들과 비교하여 해당 값이 부분수열의 몇번째 값인지 저장
			// 만약 부분수열에 포함되지 않는다면 이전에 len 이 초기화 되었기에 1을 나타낸다.
			ans = Math.max(ans, result[i]); // 각각의 부분수열의 길이 중 가장 큰 값을 저장('최장' 증가 부분수열)
		}
		System.out.println(Arrays.toString(result));
		System.out.println(ans);
	}
}
