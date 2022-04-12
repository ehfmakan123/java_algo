package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThreeDice_BOJ2480 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());

		int d1 = Integer.parseInt(st.nextToken());
		int d2 = Integer.parseInt(st.nextToken());
		int d3 = Integer.parseInt(st.nextToken());
		
		if(d1 == d2 && d2 == d3) {
			System.out.println(10000+(d1*1000));
		}else if(d1 == d2 || d2 == d3 || d1 == d3) {
			if((d1 - d2) == 0) {
				System.out.println(1000 + (d1*100));
			}else {
				System.out.println(1000 + (d3*100));
			}
		}else {
			int res = Math.max(d1, d2);
			res = Math.max(res, d3);
			System.out.println(res*100);
		}
	}

}
