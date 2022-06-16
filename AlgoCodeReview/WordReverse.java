import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
//  (프로그래머스)
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] str = new String[N];
		for(int i= 0 ; i < N ; i++) {
			str[i] = br.readLine();
		}
		for(String x : T.solution(N,str)) {
			System.out.println(x);
		}
	}
	public ArrayList<String> solution(int N , String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}

}

//설명
//
//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
//
//두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
//
//
//출력
//N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.

// StringBuilder 사용 , reverse() , toString() 메소드를 이용하여 단어 뒤집기 및 String 형변환 가능 buffer도 동일 기능 존재
// ArrayList<E> 에 들어가는 <E> => 제네릭(Generic)
// 사용할 객체의 타입을 지정해주는 역할
// 타입 안정성 및 불필요한 형변환을 줄여 코드 간결성 부여
