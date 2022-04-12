package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Momreader_BOJ2775 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//System.setIn(new FileInputStream("res/Mom_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int arr [][] = new int[15][15];
		for(int t = 1 ; t <= T ; t++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			for(int i = 0 ; i < 15 ; i++) {
				arr[i][0] = 1;
				arr[0][i] = i+1;
			}
			for(int i = 1 ; i< 15 ; i++) {
				for(int j = 1 ; j < 15 ; j++) {
					sum = 0;
					for(int l = 0 ; l <= j ; l++) {
						sum += arr[i-1][l];
					}
					arr[i][j] = sum;
				}
			}
			System.out.println(arr[k][n-1]);
		}
//		for(int i = 0 ; i < 15; i++) {
//			for(int j = 0 ; j < 15; j++) {
//				System.out.print(arr[i][j]+" ");
//			}System.out.println();
//		}
	}

}


