package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlusOrMinus {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long res = str.charAt(0)-'0';// 첫번째 문자
		for(int i = 1 ; i < str.length() ; i++) { // 두번째부터 
			int num = str.charAt(i)-'0';
			if(num <= 1 || res <= 1) { // 0 or 1 일때는 더하기
				res += num;
			}else {
				res *= num; // 나머지는 곱하기
			}
		}
		System.out.println(res);
	}

}
