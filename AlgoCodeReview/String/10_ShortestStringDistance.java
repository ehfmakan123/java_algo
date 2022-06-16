import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws Exception {
//  (프로그래머스)
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		char c = st.nextToken().charAt(0);
		for(int x : T.solution(str,c)) {
			System.out.print(x+" ");
		}
	}
	public int[] solution(String str , char t) {
		int[] answer = new int[str.length()] ;
		int key = 1000;
		for(int i = 0 ; i < str.length(); i++) {
			if(str.charAt(i) == t) {
				key = 0 ;
				answer[i] = key;
			}else {
				key++;
				answer[i] = key;
			}
		}
		key = 1000;
		
		for(int i = str.length()-1 ; i >= 0 ; i--) {
			if(str.charAt(i) == t) {
				key = 0 ;
			}else {
				key++;
				answer[i] = Math.min(key, answer[i]);
			}
		}
		return answer ;
	}
}

//설명
//
//한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
//
//문자열의 길이는 100을 넘지 않는다.
//
//
//출력
//첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
//

// 왼쪽부터 우선 특정 문자열과의 거리를 센 후 오른쪽에서 부터 거리를 센다. 단, 오른쪽에서 거리를 셀 경우 기존의 값과 비교하여 거리가 작은 것을 남긴다.
// 아이디어만 생각해내면 쉽게 풀 수 있음.
