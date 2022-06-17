import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws Exception {
//  (프로그래머스)
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(T.solution(str));
	}
	public String solution(String s) {
		String answer = "";
		s += " ";
		int cnt = 1;
		for(int i = 0 ; i < s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				cnt++;
			}else {
				answer  += s.charAt(i);
				if(cnt > 1 ) {
					answer += String.valueOf(cnt);
					cnt = 1;
				}
			}
		}
		return answer ;
	}
}
//설명
//
//알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
//
//문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
//
//단 반복횟수가 1인 경우 생략합니다.
//
//
//입력
//첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
//
//
//출력
//첫 줄에 압축된 문자열을 출력한다.
//
//문자열을 하나씩 비교 후 앞의 문자와 같으면 내부 cnt++ , 다를 경우 문자 출력 후 cnt 출력 (단 cnt가 1이상인 경우에 출력) , cnt를 초기화 (1)
