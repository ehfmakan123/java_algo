package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringReset {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res/StringReset_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] arr = new char[str.length()];
		int sum = 0 ;
		
		for(int i = 0 ; i < str.length() ; i++) {
			char temp = str.charAt(i);
			if(temp >= 'A' && temp <= 'Z') {
				arr [i] = temp;
			}else {
				sum += temp-'0';
			}
		}
		Arrays.sort(arr);
		String res  = new String(arr).trim();
		System.out.println(res+sum);
	}

}
