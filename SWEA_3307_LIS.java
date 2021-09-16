package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LIS_SWEA3307 {

	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("res/input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		int res = 0 ;
		
		for(int tc = 1 ; tc <= T ;tc++) {
			sb.append("#").append(tc).append(" ");
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for(int i = 0 ; i < N ; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int[] temp = new int[N];
			
			for(int i = 0 ; i < N ; i++) {
				temp[i] = 1;
				for(int  j = 0 ; j < i ; j++) {
					if(arr[i] > arr[j]) {
						temp[i] = Math.max(temp[i],temp[j]+1);
					}
				}
			}
			
			for(int i = 0 ; i < N ; i++) {
				res = Math.max(res, temp[i]);
			}
			sb.append(res).append("\n");
			res = 0;
		}
		System.out.println(sb.toString());
		br.close();
	}
}
