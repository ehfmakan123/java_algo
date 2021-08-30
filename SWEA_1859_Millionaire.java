
package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Millionaire_SWEA1859 {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/Millionaire_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1 ; tc <= T ; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			
			sb.append("#").append(tc).append(" ");
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0 ; i < N ; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			long sum = 0 ;
			int max = arr[N-1];
			for(int i = N-2 ; i >= 0 ; i--) {
				if(max < arr[i]) max = arr[i];
				else sum = sum + (max -arr[i]);
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
}

