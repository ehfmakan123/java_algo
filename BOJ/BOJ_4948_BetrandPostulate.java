package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BetrandPostulate_BOJ4948 {
static int cnt ;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = 1;
		while(N != 0) {
			cnt = 0 ;
			N = Integer.parseInt(br.readLine());

			if(N == 0) {
//				System.out.println(N);
				break;
			}
			search(N);
			System.out.println(cnt);
		}
	}

	private static void search(int n) {
		// TODO Auto-generated method stub
		boolean arr[] = new boolean[2*n+1] ;
		arr[1] = true;
		for(int i = 2; i <= 2*n ; i++) {
			if(!arr[i]) {
				for(int j = 2 ; i*j<= 2*n ; j++) {
					arr[i*j] = true;
				}
			}
		}
		for(int i = n+1 ; i <= 2*n ; i++) {
			if(!arr[i]) {
				cnt++;
			}
		}
		
	}

}

//에라토스테네스의 체 구현 까먹지말기
