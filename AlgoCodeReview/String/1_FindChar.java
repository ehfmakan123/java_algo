

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// 나의 풀이 방법.
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		str = str.toUpperCase();
//		char c = br.readLine().toUpperCase().charAt(0);
//		int cnt = 0 ;
//		for(int i = 0 ; i < str.length() ; i++) {
//			if(str.charAt(i) == c) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
//		br.close();
		
// 두번째 풀이 방법 (프로그래머스)
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char c = br.readLine().charAt(0);
		System.out.print(T.solution(str,c));
	}
	
	public int solution(String str , char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		for(char c : str.toCharArray()) {
			if(c == t) {
				answer++;
			}
		}
		return answer;
	}

}

//설명
//
//한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
//
//대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
//
//
//입력
//첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
//
//문자열은 영어 알파벳으로만 구성되어 있습니다.
//
//
//출력
//첫 줄에 해당 문자의 개수를 출력한다.


// CS 공부 = String vs StringBuffer vs StringBuilder
// String 은 불변성을 가짐 (문자열 수정 X ) : 추가로 연산 할 시 Heap 메모리에 많은 가비지생성 -> 연산능력 저하
// StringBuffer의 경우 멀티 스레드(동기화 가능) 특징을 지님. 
// StringBuildere의 경우 멀티 스레드(동기화 가능) 특징 X. -> 단일 스레드 환경에서 높은 성능을 보임

// 스레드 vs 프로세스
// 스레드 = 프로세스 안에서 할당되는 CPU의 기본 실행 단위 , 한번에 하나의 스레드만 실행 가능
// 단일 스레드 -> 1메인 프로세스 1스레드 할당 . 멀티 스레드에 비해 동기화 신경 X , 문맥교환(context switch )작업X
// 멀티 스레드 -> 2개 이상의 스레드가 프로세스 안에서 자원을 분배하여 작업 ,응답성 , 경제성 ,멀티 프로세서 활용 가능 
