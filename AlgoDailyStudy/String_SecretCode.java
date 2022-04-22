package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SecretCode {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		for(int i = 0 ; i < N ; i++) {
			String tmp = str.substring(0,7).replace('#', '1').replace('*','0');
			int num = Integer.parseInt(tmp,2); // String 을 받아서 2진수로 인식
			System.out.print((char)num); // 아스키넘버를 char형으로 형변환 (문자로 변환됨)
			str = str.substring(7);
		}
	}

}
