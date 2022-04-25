package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CombZero {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		
		int cnt5 = five(N) - five(N-M) - five(M);
		int cnt2 = two(N) - two(N-M) - two(M);
		System.out.println(Math.min(cnt2, cnt5));
		
	}

	private static int two(long x) {
		// TODO Auto-generated method stub
		int res = 0 ;
		
		while(x >= 2) {
			res += x/2;
			x /= 2;
		}
		
		return res;
	}

	private static int five(Long x) {
		// TODO Auto-generated method stub
		int res = 0 ;
		
		while(x >= 5) {
			res += x/5;
			x /= 5;
		}
		return res;
	}

}
