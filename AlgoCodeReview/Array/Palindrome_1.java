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
		
		char [] s = str.toCharArray();
		int lt = 0 , rt = str.length()-1;
		while(lt < rt) {
			if(!Character.isAlphabetic(s[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(s[rt])) {
				rt--;
			}else {
				if(s[lt] == s[rt]) {
					lt++;
					rt--;
				}else {
					answer = "NO";
					break;
				}
			}
		}
		return answer;
	}
}


//설명
//
//앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
//
//문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
//
//단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
//
//알파벳 이외의 문자들의 무시합니다.
//
//
//입력
//첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
//
//
//출력
//첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.



// 이전에 한걸 응용해보는 느낌 , 새로운건 X , StringBuilder를 사용하는 방법에 비해 코드가 길지만 풀이 시간이 짧아짐.
