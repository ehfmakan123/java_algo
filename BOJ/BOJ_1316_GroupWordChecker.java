package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int N , res ;
	static BufferedReader br ;
	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("res/GroupWordChecker_input.txt"));
		br= new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); // 단어의 갯수 
		res = 0;  	// 출력값
		
		for(int i = 0 ; i < N ; i++) { // 단어들을 하나하나 검사
			if(check()) { // 각 단어에 check 함수를 돌려서 true 일 경우 res++;
				res++;
			}
		}
		System.out.println(res);
		br.close();
	}
	
	private static boolean check() throws IOException {
		
		boolean[] check = new boolean [26]; // 단어 중복 검사
		
		int pre = 0 ;	// 이전 나온 알파벳
		
		String str = br.readLine(); // 단어를 읽음
		
		int len = str.length();
		
		for(int i = 0 ; i < len ; i++ ) {
			
			int now = str.charAt(i); // 현재 읽는 알파벳 
			
			if( pre != now) { // 단어가 전단어와 다른 경우
				
				if(!check[now - 'a']) {	// 중복이 아닌 경우
					
					check[now -'a'] = true; // 중복 체크
					
					pre = now; // 다음 단어 check를 위해 pre를 변경
					
				}
				
				else { // 중복인 경우
					return false; // 종료
				}
			}
			
			else { // 이전 단어와 현재 단어가 같은 경우
				continue; // 그대로 넘어감
			}
		}
		return true;
	}

}
