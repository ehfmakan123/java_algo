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
// 	#######################StringBuilder 를 이용한 방법 #######################
// 		for(String x : str) {
// 			String tmp = new StringBuilder(x).reverse().toString();
// 			answer.add(tmp);
// 		}
//      ############################################################################
// 
//
//
//     ######################## String을 이용해 그대로 뒤집는 방법 ######################
		for(String x : str) {
			char [] s = x.toCharArray();
			int lt = 0 , rt = x.length()-1;
			while(lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = s[lt];
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
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
// String을 뒤집는 방법의 경우 char 형태로 변환하여 단어를 뒤집어 준 후 String.ValueOf()를 이용하여 String으로 변환해준다.

// ArrayList<E> 에 들어가는 <E> => 제네릭(Generic)
// 사용할 객체의 타입을 지정해주는 역할
// 타입 안정성 및 불필요한 형변환을 줄여 코드 간결성 부여
