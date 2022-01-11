package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPoint_BOJ1712 {
	public static int A,B,C,res;
	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("res/BreakEvenPoint.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		if(B >=  C) {
			System.out.println("-1");
		}else {
			res = (A / (C -B)) + 1;
			System.out.println(res);
		}
		br.close();
	}

}
