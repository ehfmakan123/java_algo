package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int min = 2; // 최솟값
		int count = 1;
		
		if(N == 1) {
			System.out.println("1");
		}else {
			while(true) {
				if(N >= min) {
					min = min + ( 6*count);
					count++;
				}
				else{
					System.out.println(count);
					break;
				}
			}
		}
		br.close();
	}
}
