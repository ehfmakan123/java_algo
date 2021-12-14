package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/Words_BOJ1152.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); // 띄워쓰기 기준 자동으로 문장을 토큰으로 저장
		System.out.println(st.countTokens()); // st.countTokens()를 사용하면 안에 잇는 토큰의 갯수를 셀 수 있다.
		br.close();
	}

}
