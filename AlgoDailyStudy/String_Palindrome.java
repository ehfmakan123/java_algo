package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		StringBuilder sb = new StringBuilder(str.toUpperCase()).reverse();
		
		if(str.equals(sb.toString())) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
