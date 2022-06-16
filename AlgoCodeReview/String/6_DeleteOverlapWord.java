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
	public String solution(String str) {
		String answer = "" ;
		Queue<Character> q = new LinkedList<Character>();
		for(char c : str.toCharArray()) {
			if(!q.contains(c)) {
				q.offer(c);
			}
		}
		while(!q.isEmpty()) {
			answer += Character.valueOf(q.poll());
		}
		return answer;
	}

}


//설명
//
//소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
//
//중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
//
//
//입력
//첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
//
//
//출력
//첫 줄에 중복문자가 제거된 문자열을 출력합니다.
//

// Queue 를 이용해 넣음과 동시에 중복 제거해주기 , offer() , poll(), peek() 사용법 
