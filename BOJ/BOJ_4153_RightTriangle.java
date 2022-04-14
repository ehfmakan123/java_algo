package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RightTriangle_BOJ4153 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a + b + c == 0) {
				break;
			}else {
				int lnum = Math.max(Math.max(a, b), Math.max(c, b));
				if(lnum*lnum*2 == a*a + b*b +c*c) {
					System.out.println("right");
				}else {
					System.out.println("wrong");
				}
			}
		
		}
	}

}
