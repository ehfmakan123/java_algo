package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class SortInside_BOJ1427 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Integer[] arr = new Integer[str.length()];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = str.charAt(i)-'0' ;
		}
		Arrays.sort(arr , Collections.reverseOrder());
		for(int i = 0 ; i < str.length() ; i++) {
			System.out.print(arr[i]);
		}
	}

}
