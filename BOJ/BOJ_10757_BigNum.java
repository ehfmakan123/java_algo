package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BigNum_BOJ10757 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res/BigNum_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		
		int max = Math.max(str1.length(), str2.length());
		
		int arr1 [] = new int[max+1];
		int arr2 [] = new int[max+1];
		int res[] = new int[max+1];
		for(int i = 0 ; i < str1.length() ; i++) {
			arr1[str1.length()-1-i] = str1.charAt(i)-'0';
		}
		for(int i = 0 ; i < str2.length() ; i++) {
			arr2[str2.length()-1-i] = str2.charAt(i)-'0';
		}
//		for(int i = 0 ; i < str1.length() ; i++) {
//			System.out.print(arr1[i]);
//		}
//		System.out.println();
//		
//		for(int i = 0 ; i < str2.length() ; i++) {
//			System.out.print(arr2[i]);
//		}
//		System.out.println();
		for(int i = 0 ; i< max+1 ; i++) {
			res[max-i] += (arr1[i] + arr2[i])%10 ; // 두 배열을 더해서 1의 자리수만 입력
//			System.out.print(res[max-i]);
			
			if(i < max) {
				res[max-i-1] += (arr1[i] + arr2[i])/10 ; // 10의자리는 더해주기
				if(res[max-i] == 10) { // 올림 계산
					res[max-i] = 0 ;
					res[max-i-1]++;
				}
			}
//			System.out.println();
		}
		if(res[0] != 0) {
			for(int i = 0 ; i< max+1 ; i++) {
				System.out.print(res[i]) ;
			}
		}else {
			for(int i = 1 ; i < max+1 ; i++) {
				System.out.print(res[i]);
			}
		}
		br.close();
	}

}

// string 형식으로 직접 구현
