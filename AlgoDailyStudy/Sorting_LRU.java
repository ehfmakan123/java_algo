package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LRU {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int N =Integer.parseInt(st.nextToken());
		int [] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i< N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int [] cache = new int[S];
		
		for(int x : arr) {
			int pos = -1; // 초기화
			for(int i = 0 ; i < S ; i++) { // 캐시 탐색
				if(x == cache[i]) pos = i; // Hit시 pos = i		}
			}if(pos == -1) { // miss
				for(int i = S - 1; i >=1 ; i--) {
					cache[i] = cache[i-1]; // 한칸씩 땡겨주기
				}
			}else { // hit 처리
				 for(int i = pos ; i>=1 ; i--) {
					 cache[i] = cache[i-1];
				 }
			}
			cache[0] = x;
		}
		for(int x : cache) {
			System.out.print(x+" ");
		}
	}

}
