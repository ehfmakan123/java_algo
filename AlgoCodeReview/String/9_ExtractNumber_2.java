import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Main {

	public static void main(String[] args) throws Exception {
//  (프로그래머스)
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(T.solution(str));
	}
	public int solution(String str) {
		int answer = 0 ;
		for(char x : str.toCharArray()) {
			if(x >= 48 && x <=57) {
				answer = answer*10 + (x-48);
			}
		}
		return answer ;
	}
}


//설명
//
//문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
//
//만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
//
//추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
//
//
//입력
//첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
//
//
//출력
//첫 줄에 자연수를 출력합니다.

// 코드는 훨씬 간결함 , 성능은 크게 차이가 없지만 이전 방법이 조금 더 빠른것같음 , 아스키코드 번호를 모르면 쓰기 힘들지만 '0' , '9' 를 사용해서 할 




