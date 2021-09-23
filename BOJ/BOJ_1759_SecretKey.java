package Test;

import java.io.*;
import java.util.*;

public class SecretKey_BOJ1759 {
	static int L , C ; // 입력받는 초기 정보 L(서로 다른 L 개의 알파벳) , C(암호의 길이)
	public static char[] temp; // 입력값을 저장할 공간. (C칸)
	public boolean chk ; //  자음모음을 체크할 boolean 타입 chk 선언
	public static boolean[] selected;  // 사용한 알파벳인지 확인할 selected 배열(C칸)
	
	public static void main(String[] args) throws Exception {		
		System.setIn(new FileInputStream("res/Secret_input.txt")); 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		L = Integer.parseInt(st.nextToken()); // 정수 L 서로다른 L개의 알파벳
		C = Integer.parseInt(st.nextToken());// 정수 C 암호의 길이.
		
		temp = new char[C]; // 입력받을 저장 공간. (C)
		selected = new boolean[C]; // 사용했는지 확인할 배열
		String[] str = br.readLine().split(" ");	

		for(int i = 0 ; i < C ; i++) {
			temp[i] = str[i].charAt(0); // 입력값을 temp에 저장.
		}
		Arrays.sort(temp); // 문제의 조건에서 문자열이 정렬 된 상태여야 하므로 미리 정렬.
		dfs(0,0,0,0);
    br.close();
	}
	public static void dfs(int start, int depth, int con , int vowel) { // 시작점 , 깊이 , 자음/모음 갯수)
		for(int i = start ; i < C ; i++) {
			selected[i] = true; // 시작 인덱스부터 C까지 중 한개를 뽑고 selected 값을 true
			dfs(i + 1 ,depth +1 ,con + (!chk(temp[i]) ? 1 : 0) , vowel + (!chk(temp[i])? 0 : 1));
			// dfs 재귀(시작인덱스 +1 , 깊이 +1 , i번째 문자 자음,모음을 판별하여 갯수 +1)
			selected[i] = false ; // 하나를 선택한 모든 경우의 수를 체크했으면 i번째 selected를 false로
		}
		if(depth == L && con >= 2 && vowel >=1) { // 깊이가 L에 도달하고 자음이나 모음의 갯수가 충분할때
			for(int i = 0 ; i < C ; i++) {
				if(selected[i] == true) { //문자열을 확인하여 출력.
					System.out.print(temp[i]);
				}
			}
			System.out.println();
		}
	}
	public static boolean chk(char c) { // 자음인지 모음인지 check 하는 boolean타입 메소드.
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true; //모음일 경우 true를 반환
		}else
			return false;
	}
}
