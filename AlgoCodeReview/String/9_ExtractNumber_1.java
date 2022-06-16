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
		char [] s = str.toCharArray();
		Queue<Character> q = new LinkedList<Character>();
		for(char c : s) {
			if(Character.isDigit(c)) {
				if(q.isEmpty() && c == '0') {}
				else {
					q.offer(c);
				}
			}
		}
		String tmp = "";
		while(!q.isEmpty()) {
			tmp += q.poll();
		}
		answer = Integer.parseInt(tmp);
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

//큐를 사용해서 숫자일때만 넣어주면서 풀었음 , 큐가 비어있을때 0이 들어오면 그냥 넘어감(숫자가 0 0 0 이런식으로 들어올까봐)
//이 후 String으로 숫자를 붙여 준 후 문자열을 숫자로 변환





