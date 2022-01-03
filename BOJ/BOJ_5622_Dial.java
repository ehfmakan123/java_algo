package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Dial_BOJ5622 {
	static int res ;
	static char key;
	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("res/dial.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int l = str.length();
		res = 0;
		for(int i = 0 ; i < l; i++) {
			key = str.charAt(i);
			call();
		}
		System.out.println(res);
		br.close();
	}
	private static void call() {
		switch(key) {
		case 'A': case 'B' : case 'C':
			res += 3 ; 
			break;

		case 'D' : case 'E': case 'F' :
			res += 4; 
			break;
	        
		case 'G' : case 'H': case 'I' :
			res += 5; 
			break;
	        
		case 'J' : case 'K': case 'L' : 
			res += 6;
			break;
	        
		case 'M' : case 'N': case 'O' :
			res += 7;
			break;
	        
		case 'P' : case 'Q': case 'R' : case 'S' : 
			res += 8; 
			break;
	        
		case 'T' : case 'U': case 'V' : 
			res += 9;
			break;
	        
		case 'W' : case 'X': case 'Y' : case 'Z' : 
			res += 10;
			break;
		}
	}
}
