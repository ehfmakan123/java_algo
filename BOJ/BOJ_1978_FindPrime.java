package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPrime {
	static int cnt ;
	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res/FindPrime_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		cnt = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++) {
			int x = Integer.parseInt(st.nextToken());
			if(x <= 2 ) {
				if( x ==2 ) {
					cnt++;
				}
				continue;
			}
			search(x);
		}
		System.out.print(cnt);
	}

	private static void search(int x) {
		for(int i = 2 ; i < (x/2)+1 ; i++) {
			if(x%i == 0) {
				cnt--;
				break;
			}
		}
		cnt++;
	}

}

//1은 소수가 아니다...!
