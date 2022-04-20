package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KeyNum_BOJ2475 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int sum = 0 ;
		int key = 0 ;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < 5 ; i++) {
			sum +=(int)Math.pow(Integer.parseInt(st.nextToken()), 2);
		}
		key = sum%10;
		System.out.println(key);
	}

}
