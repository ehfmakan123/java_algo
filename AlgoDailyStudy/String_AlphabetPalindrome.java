package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class AlphabetPalindrome {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String tmp = "";
		for(char c : str.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				tmp += c;
			}
		}
		
		
		tmp = tmp.toUpperCase();
		StringBuilder sb = new StringBuilder(tmp).reverse();
		if(tmp.equals(sb.toString())) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
//		System.out.println(tmp);
//		System.out.println(sb.toString());
	}

}
