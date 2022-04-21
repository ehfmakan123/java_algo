package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WordInSentence {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		int arr[] = new int[s.length];
		for(int i = 0 ; i < s.length ; i++) {
			arr[i] = s[i].length();
			res = Math.max(res, s[i].length());
		}
		for(int i = 0 ; i < s.length ; i++) {
			if(res == arr[i]) {
				System.out.println(s[i]);
				break;
			}
		}
	}

}

//split() 으로 배열에 쪼개넣기 가능
