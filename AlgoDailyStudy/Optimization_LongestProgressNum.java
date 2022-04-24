package Optimization;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LongestProgressNum {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int res = 0 , cnt = 0 , lt = 0; // 최대 길이 , 0 카운트
		for(int rt = 0 ; rt < N ; rt++) {
			if(arr[rt] == 0) cnt++; // 0을 만나면 일단 카운트 증가
			while(cnt > K) { // 최대 카운트를 넘어버렸으면
				if(arr[lt] == 0 ) cnt --; // 0을 lt가 물고 있었으면
				lt++;
			}
			res = Math.max(res, rt-lt+1);
		}
		System.out.println(res);
	}

}
