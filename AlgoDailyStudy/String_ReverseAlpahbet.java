package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAlphabet {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] c = str.toCharArray();
		int st = 0 , ed = str.length()-1;
    
		while(st < ed) {
			if(!Character.isAlphabetic(c[st])) {
				st++;
			}else if(!Character.isAlphabetic(c[ed])) {
				ed--;
			}else {
				char tmp = c[st];
				c[st] = c[ed];
				c[ed] = tmp;
				st++;
				ed--;
			}
		}
		String res = String.valueOf(c);
		System.out.println(res);
	}

}

// toCharArray() 사용 해서 배열화 후 앞과뒤를 탐색하며 알파벳만 자리를 바꾼다
