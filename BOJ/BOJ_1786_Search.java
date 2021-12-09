package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Search_BOJ1786 {
	static int res = 0;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/Search_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String T = br.readLine();
		String P = br.readLine();
		
		kmp(T,P);
		System.out.println(res);
		System.out.println(sb.toString());
		br.close();
	}

	 public static void kmp(String t, String p) {
	    int[] pi = getpi(p);
	    int n = t.length(), m = p.length();
		int x = 0 ;
		
		for (int i = 0; i < n; i++) {
	        while (x > 0 && t.charAt(i) != p.charAt(x))
	              x = pi[x - 1];
	        if (t.charAt(i) == p.charAt(x)) {
				if( x == m-1) {
					res++;
					sb.append(i - m +2).append('\n');
					x = pi[x];
				}else 
					x++;
			}
		}
	}
	private static int[] getpi(String p) {
		int m = p.length();
		int[] pi =  new int[m];
		int x = 0 ;
		for(int i = 1 ; i < m ;i++) {
			while( x > 0 && p.charAt(i) != p.charAt(x)) {
				x = pi[x-1];
			}
			if(p.charAt(i)== p.charAt(x)) {
				pi[i] = ++x;
			}
				
		}
		return pi;
	}
	
}
