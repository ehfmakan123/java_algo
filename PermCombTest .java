package Test;

import java.util.Arrays;

public class Main {
	public static boolean[] chk = new boolean[100];

	public static int count = 0 ;
	public static int R = 2;
	public static int[] num = new int[R];
	public static int comb(int n, int r) {
		
		if(n == r || r == 0) return 1;
		return comb(n-1,r-1)+comb(n-1,r);
	}
	public static int perm(int n , int r) {
		if(r == 1) return n;
		return n*perm(n-1,r-1);
	}
	public static void perm2(int r , int cnt) {
		if(cnt == R) {
			System.out.println(Arrays.toString(num));
			count++;
			return;
		}
		//가능한 모든수를 시도
		for(int i = 1 ; i <= r ; i++) {
			if(chk[i] == true) continue; // 사용중인 수면 다음수로.
			num[cnt] = i ;
			chk[i] = true; // 선택함.
			perm2(r,cnt+1);
			chk[i] = false; // 첨위치에 i 뽑은 경우의수 모두 체크했으므로 다시 false
		}
	}
		static int[] input  = new int[] {1,8,2,9,6};
		
	public static void perm3(int cnt) {
		if(cnt == R) {
			System.out.println(Arrays.toString(num));
			count++;
			return;
		}
		//가능한 수들이 들어있는 배열 모든 원소 의 수.
		for(int i = 0 ; i < input.length ; i++) { // i는 인덱스.
			if(chk[i] == true) continue; // 사용중인 수면 다음수로.
			num[cnt] = input[i];
			chk[i] = true; // 선택함.
			perm3(cnt+1);
			chk[i] = false; // 첨위치에 i 뽑은 경우의수 모두 체크했으므로 다시 false
		}
	}
	
	public static void comb2(int cnt , int start) { // N개의 서로 다른 수 R뽑는 조합. , 시작 인덱스 추가.
		if(cnt == R) {
			System.out.println(Arrays.toString(num));
			return;
		}
		//start 위치의 수 부터 가능한 수 모두 고려.
		//가능한 수들이 들어있는 배열 모든 원소 의 수.
		for(int i = start ; i < input.length ; i++) { // i는 인덱스.
			num[cnt] = input[i];
			comb2(cnt+1,i+1); // 현재 선택한 수 말고 다음거.
		}
	}
	
	public static void main(String[] args) {
		
//		System.out.println(comb(5,1));
//		System.out.println(perm(5,5));
//		perm2(5,0);
//		count = 0 ;
//		perm3(0);
//		System.out.println(count);
		comb2(0,0);
	}

}
