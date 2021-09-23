package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Confetti_S4_BOJ10163 {

	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("res/IM_색종이.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		int T = Integer.parseInt(br.readLine());
		int[][] arr = new int[1001][1001];
		for(int i = 1 ; i  <= T ; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			for(int j = x ; j < x + a ; j++) {
				for(int k = y ; k < y+b ; k++) {
					arr[j][k] = i;
				}
			}	
		}
		for(int t = 1 ; t <= T ; t++) {
			int sum = 0;
			for(int j = 0 ; j < 1001; j++) {
				for(int k = 0 ; k < 1001 ; k++) {
					if(arr[j][k] == t) {
						sum++;
					}
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
}
