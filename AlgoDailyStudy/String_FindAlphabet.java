package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindAlphabet {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
    
    // 풀이 1
//		int[] arr = new int [26];
//		int N = br.readLine().toUpperCase().charAt(0)-'A';
//		for(int i = 0 ; i < str.length() ; i++) {
//			arr[str.charAt(i)-'A']++;
//		}
//		System.out.println(arr[N]);

// 풀이 2


		int cnt = 0 ;
		char key = br.readLine().toUpperCase().charAt(0);
		for(int i = 0 ; i < str.length()  ; i++) {
			if(str.charAt(i) == key) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}


