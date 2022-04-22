package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class StringZip {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine()+" ";
		int cnt = 1;
		char[] arr = str.toCharArray();
		String res = "";
    
		for(int i = 0 ; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				cnt++;
			}else {
				res += str.charAt(i);
				if(cnt != 1) {
					res += String.valueOf(cnt);
					cnt =1 ;
				}
			}
		}
    
		System.out.println(res);
	}

}
