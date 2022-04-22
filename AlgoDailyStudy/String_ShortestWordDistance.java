package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WordDistance {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		int[] arr = new int [str.length()];
		char c = st.nextToken().charAt(0);
		int cnt = 99999; 
		for(int i = 0 ; i < str.length() ; i++) { // 왼쪽에서 오른쪽으로 가면서 카운트
			if(str.charAt(i) == c ) {
				cnt = 0 ;
				arr[i] = cnt;
			}else {
				cnt++;
				arr[i] = cnt;
			}
		}
		for(int i = str.length()-1 ; i >= 0 ; i--) {
			if(str.charAt(i) == c) {
				cnt = 0 ;
			}else {
				cnt++;
				arr[i] = Math.min(arr[i], cnt); 
			}
		}
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
