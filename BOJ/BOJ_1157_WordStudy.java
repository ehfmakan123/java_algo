package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args)throws Exception{
		System.setIn(new FileInputStream("res/wordstudy_input.txt")); // 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int [26]; // 알파벳을 저장할 배열
		String str = br.readLine().toUpperCase(); // 대소문자 구분없이 count하므로 대문자로 입력 저장.
		int max = 0 ; // 최댓값 저장
		int idx= 0 ; // 가장 마지막 최댓값의 자리
		
		for(int i =0; i < str.length() ; i++) {
			arr[str.charAt(i)-'A']++; // 숫자로 변환해서 저장
		}
		for(int i = 0 ; i <arr.length ; i++) { // 최댓값계산
			if(max < arr[i]) {
				max = arr[i];
				idx = i ;
			}
		}
		Arrays.sort(arr); // 정렬해서 최댓값과 그 다음값이 같은지 비교 (최댓값만큼 나오는 알파벳이 2개이상인지 확인 )
		if(arr[arr.length-1] != arr[arr.length-2]) {
			System.out.println((char)(idx+'A'));
		}else {
			System.out.println("?");
		}
		br.close();
	}
}
