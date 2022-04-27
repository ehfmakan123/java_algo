package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CuttingLAN_BOJ1654 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken()); // 이미 가지고 있는 랜선 개수
		int N = Integer.parseInt(st.nextToken()); // 필요한 랜선의 개수
		int[] arr =new int [K];
		
		
		for(int i = 0 ; i < K ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		long rt = arr[K-1]; // 들어오는 최댓값
		long lt =1 ; // 들어오는 입력값의 최솟값 될 수 있는 경우의 수 ( 1  부터 시작)
		
		while(lt <= rt) {
			long mid = (lt+rt) / 2; //중간값
			long cnt = 0 ;
			
			for(int i = 0 ; i < arr.length ; i++) {
				cnt += arr[i]/mid; // 각 배열을 mid 로 나누어본다 (나눈 몫을 cnt 에 더함 (목표 = N)
			}
			if(cnt >= N) { // 큰 경우는 lt 값을 mid+1 부터 시작
				lt = mid +1;
			}else { // 아닌경우는 rt값을 mid-1 부터 시작
				rt = mid -1 ; // N 값을 넘어가는 시점의 값 -> 구하려는 값.
			}
		}
		System.out.println(rt);
	}	

}
