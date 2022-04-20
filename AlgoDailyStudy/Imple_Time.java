package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Time {
static int cnt = 0 ;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i <= N ; i++) {
			for(int j = 0 ; j < 60 ; j++) {
				for(int k = 0 ; k < 60 ; k++) {
					find(i,j,k);
				}
			}
		}
		System.out.println(cnt);
	}

	private static void find(int h, int m, int s) {
		// TODO Auto-generated method stub
		if(h % 10 == 3 || m % 10 == 3 || m / 10 == 3 || s % 10 == 3 || s / 10 == 3) {
			cnt++;
		}
	}

}
