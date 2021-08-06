package Test;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("res/input.txt"));
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int t = 1 ; t <= tc ; t++) {
			int N = sc.nextInt();
			int sum = 0 ;
			int[][] arr = new int [N][N];	
			
//			for(int i = 0 ; i < N ; i++) {
//				for(int j = 0 ; j <N ; j++) {
//					arr[i][j]  = sc.nextInt();
//				}
//			}
			
			for(int i=0; i<N; i++) {
				String s = sc.next();
				for(int j=0; j<N; j++) {
				arr[i][j] = s.charAt(j)-'0';
				}
			}
			
			int h = (int)N/2 ;
			
		
			for(int i = 0 ; i < N ; i++) {
				for(int j = Math.abs(h-i) ; j <N-Math.abs(h-i); j++) {
					sum += arr[i][j];
				}
			}
			System.out.println("#"+t+" "+sum);
		}
	}
}



