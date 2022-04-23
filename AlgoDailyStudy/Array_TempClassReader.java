package Array;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test T = new test();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+1][6];
		for(int i = 1 ;i <= n;i++) {
			for(int j = 1; j <=5 ; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(T.solution(n,arr));
	}

	private int solution(int n, int[][] arr) {
		// TODO Auto-generated method stub
		int ans = 0 , max = Integer.MIN_VALUE;
		for(int i = 1 ; i <= n ; i++) {
			int cnt = 0 ;
			for(int  j = 1;  j <= n ;j++) {
				for(int k = 1 ; k <= 5; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt>max) {
				max= cnt;
				ans = i;
			}
			
		}
		return ans;
	}

}
