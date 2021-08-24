package Test;

import java.io.*;
import java.util.*;
public class StudyRoom_BOJ11000 {
	private static int N ;
	private static int[][] arr;
	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("res/StudyRoom_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][2];
		
		for(int i = 0 ; i < N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j = 0 ; j < 2 ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(arr , new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}else {
					return o1[0] - o2[0];
				}
			}	
		});
		
		int cnt = 1;
		int temp = 0 ;
		
		for(int i = 0 ; i <N ; i++) {
			if(arr[temp][1] <= arr[i][0]) {
				cnt++;
				temp = i ;
			}
		}
		System.out.print(cnt);
		br.close();
	}
}
