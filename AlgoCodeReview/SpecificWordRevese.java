import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
//  (프로그래머스)
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
	
		System.out.println(T.solution(str));
	}
	public String solution(String str) {
		String answer = "" ;
		char[] s = str.toCharArray();
		int lt = 0 , rt = str.length()-1;
		while(lt < rt) {
			if(!Character.isAlphabetic(s[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(s[rt])) {
				rt--;
			}else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		return answer;
	}

}
//설명
//
//영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
//
//특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
//
//
//출력
//첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.

// 이전문제랑 별 차이가 없는 문제 , String 을 toCharArray() 를 사용해 변환한 후 단어들을 비교하면서 전환, String.ValueOf() 를 이용하여 String으로 다시 변환
// Character.isAlphabetic() 정도만 생각하면 어려움 없이 풀 수 있음.

