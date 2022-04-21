package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseWord {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < N ; i++) {
			StringBuilder str = new StringBuilder(br.readLine());
			str.reverse();
			System.out.println(str);
		}
	}

}

//String 은 정적 StringBuilder / StringBuffer => 가변
