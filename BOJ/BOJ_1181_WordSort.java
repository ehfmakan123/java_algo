package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class WordSet_BOJ1181 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res/WordSet_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] str = new String[N];
		for(int i = 0 ; i < N ; i++ ) {
			str[i] = br.readLine();
		}
		
		Arrays.sort(str, new Comparator<String>() { // 정렬하는 sort.함수 재정의

			@Override
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) { // 문자열의 길이가 같으면 일반 비교(사전순)
					return s1.compareTo(s2);
				}else {
					return s1.length() - s2.length(); // 다른경우 길이를 비교하여 출력
				}
			}
		});
		
		System.out.println(str[0]); // 처음거 출력 ( 중복체크를 위함)
		
		for(int i = 1; i < N ; i++) { 
			if(!str[i].equals(str[i-1])){  // 소팅 후 이전단어와 같으면 출력 X
				System.out.println(str[i]);
			}
		}
			
	}

}
