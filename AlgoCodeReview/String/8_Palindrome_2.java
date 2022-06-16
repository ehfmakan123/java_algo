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
		String answer = "NO" ;
		str = str.toUpperCase().replaceAll("[^A-Z]","");
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) answer = "YES";
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

// StringBuilder를 사용하는 방법.

// String객체의 replaceAll() 을 사용해 특수문자를 제거 한 후 뒤집어서 비교하였음.
// 정규식 표현의 경우 ^가 들어가면 부정형으로 사용할 수 있음
// 따라서 [^A-Z] 의 경우 알파벳 A to Z 가 아닌 모든 문자를 지칭
// replaceAll() 메소드를 사용하여 알파벳 대문자가 아닌 모든 문자를 공백으로 변환(제거)




