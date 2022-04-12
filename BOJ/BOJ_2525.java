package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OvenTimer_BOJ2525 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int plus = Integer.parseInt(br.readLine());
		
		m += plus;
		t += (m/60);

		m %= 60;
		t %= 24;
		
		System.out.print(t+" "+m);

	}

}
