package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class SortingXY {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		for(int i = 0 ; i< N ;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
//		Arrays.sort(arr, new Comparator<int[]>() {
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				// TODO Auto-generated method stub
//				if(o1[0] == o2[0]){
//					return o1[1] - o2[1];
//				}else {
//					return o1[0] - o2[0];
//				}
//			}
//		});
		
		
		//람다식 표현
		Arrays.sort(arr,(e1,e2)->{
			if(e1[0] == e2[0]) {
				return e1[1]-e2[1];
			}else {
				return e1[0]-e2[0];
			}
		});
		
		for(int i = 0 ; i < N ;i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	}

}
