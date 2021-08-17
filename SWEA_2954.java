import java.io.*;
import java.util.*; // io , util import 

public class Main {

	public static void main(String[] args)throws Exception { // 예외처리
	//	System.setIn(new FileInputStream("res/input.txt")); // 프로그램 내에서 입력 (연습용)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼드 리더를 사용
		StringBuilder sb = new StringBuilder(); // 출력을 모아서 할 스트링 빌더 선언

		String str = br.readLine(); // 입력되는 문장을 저장합니다.
		
		char[] c = new char[str.length()]; // 저장한 문장을 넣어줄 char형 배열 선언
		
		int cnt = 0;// 복호화에 사용할 count 변수값 설정	
		
		for(int i = 0 ; i< str.length() ; i++) { // 입력받은 str의 길이만큼 반복문을 돌립니다.
			c[cnt] = str.charAt(i);	// cnt를 변수로 받는 배열 c에 str을 파싱해서 한글자씩 넣습니다.
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||str.charAt(i) == 'u') {
				i += 2; // 파싱해서 넣는 문자가 모음일 경우 현재 i값에 2를 더하여 현재 모음 뒤 2글자를 건너뛰어 배열에 저장합니다.
			}
			sb.append(c[cnt++]); // 스트링 빌더에 배열c를 넣어줍니다.
		}
		System.out.print(sb.toString()); // 스트링 빌더를 출력합니다.
		br.close(); // 버퍼드 리더를 닫습니다.
	}
}
