package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindAlphabet_BOJ10809 {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/FindAlphabet.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		for(int i =0 ; i < s.length() ; i++) {
			if(arr[s.charAt(i)-'a'] == -1) {
				arr[s.charAt(i) - 'a'] = i;
			}
		}
		for(int i = 0 ; i < arr.length ; i++) {
			sb.append(arr[i]+" ");
		}
		System.out.print(sb.toString().trim());
		br.close();
	}

}
