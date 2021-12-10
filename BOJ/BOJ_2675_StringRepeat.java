package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stringrepeat_BOJ2675 {
	static char[] arr;
	static int T,R;
	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("res/Stringrepeat.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		T = Integer.parseInt(br.readLine());
		for(int i = 0 ; i <T  ; i++) {
			st = new StringTokenizer(br.readLine());
			R = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			arr = new char[str.length()];
			for(int j = 0 ; j < str.length() ; j++) {
				arr[j] = str.charAt(j);
				for(int l = 0 ; l < R ;l++) {
					System.out.print(arr[j]);
				}
			}
			System.out.println();
		}
		br.close();
	}

}
