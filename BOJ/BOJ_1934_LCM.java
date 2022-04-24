package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lcm_BOJ1934 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st ; 
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			System.out.println((x*y)/gcd(Math.max(x, y) , Math.min(x, y)));
		}
	}

	private static int gcd(int x, int y) {
		int r = x % y ;
		if(r == 0 ){
			return y;
		}else {
			return gcd(y,r);
		}
	}

}
