package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ring_BOJ3036 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int key = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i < N ; i++) {
			int nk = Integer.parseInt(st.nextToken());
			int gcd = gcd(Math.max(key, nk) , Math.min(key, nk));
			System.out.println((key/gcd)+"/"+(nk/gcd));
		}
	}

	private static int gcd(int a, int b) {
		int c = a % b;
		if(c == 0) {
			return b;
		}else {
			return gcd(b,c);
		}
	}
}
