//swea 1204

import java.util.*;
import java.io.*;
public class Mode {
// 최빈수 구하기
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("res/최빈수 구하기_input.txt"));
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();	
			
		for(int tc = 1 ; tc <= num ; tc++) {
			int[] arr = new int[101];
			int max = 0 ;
			int result = 0;
			int a = sc.nextInt();
			
			for(int i = 0 ; i<1000 ; i++) {
				int b = sc.nextInt();
				arr[b]++;
			}
		
			for(int i =0 ; i <101 ; i++) {
				if(max <= arr[i]) {
					max = arr[i];
					result = i;
					}
				}
		System.out.println("#" +tc+" "+result);
		}
	}
}
