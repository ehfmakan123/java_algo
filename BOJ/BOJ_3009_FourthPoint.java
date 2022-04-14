package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Fourthpoint_BOJ3009 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		int[] arr1 = new int[4];
		int[] arr2 = new int[4];
		
		for(int i=  0 ; i < 3 ; i++) {
				st = new StringTokenizer(br.readLine());
				arr1[i] = Integer.parseInt(st.nextToken());
				arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		if(arr1[0] == arr1[1]) {
			arr1[3] = arr1[2];
		}else if(arr1[1] == arr1[2]) {
			arr1[3] = arr1[0];
		}else {
			arr1[3] = arr1[1];
		}
		if(arr2[0] == arr2[1]) {
			arr2[3] = arr2[2];
		}else if(arr2[1] == arr2[2]) {
			arr2[3] = arr2[0];
		}else {
			arr2[3] = arr2[1];
		}
	
		System.out.println(arr1[3]+" "+arr2[3]);
	}
}

// 배열에 각 점을 넣고 (x,y) 한개만 있는 포인트를 넣음
