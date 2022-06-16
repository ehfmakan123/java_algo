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
		String answer = "YES" ;
		str = str.toUpperCase();
		char s [] = str.toCharArray();
		int lt = 0 , rt = str.length()-1;
		while(lt < rt) {
			if(s[lt] == s[rt]) {
				lt++;
				rt--;
			}else {
				answer = "NO";
				break;
			}
		}
		return answer;
	}
}


//설명
//
//앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
//
//문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
//
//단 회문을 검사할 때 대소문자를 구분하지 않습니다.
//
//
//입력
//첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
//
//
//출력
//첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
//
//

// 회문 문자열 문제 , 이전에는 StringBuilder로 받은 후 이전 문자와 equals를 이용하여 각 자리를 비교한 후 풀었음
// 이번에는 각 자리를 비교해가면서 풀었음.
// 입력값의 자릿수가 많아질수록 지금 방법이 조금 더 나은 성능을 보일거라 생각함.

