package Test;

import java.io.*;
import java.util.*;

public class Ref {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.setIn(new FileInputStream("res/Ref_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr =  new int [N][2];
		
		for(int i = 0 ; i < N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[i][0] = x; // 최저 온도
			arr[i][1] = y ; // 최대온도.
		}
		
		Arrays.sort(arr , new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);
			}
		});
		int res = 1;
		int max = arr[0][1];
		
		for(int i = 0 ; i  < N ; i++) {
			if(max < arr[i][0]) {
				max = arr[i][1];
				res++;
			}
		}
		
		System.out.print(res);
		br.close();
	}

}
