package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // N번쨰 분수 구하기
		
		int S = 0; // 몇번쨰 줄인가
		int count = 0;
		
		while( count <N ) {
			S++;
			count = S * (S+1) / 2; // 몇번째숫자인가 (n(n+1)/2) -> 등차수열		
			}
		
		if( S % 2 !=0) { // 홀수번쨰 줄수 우상향
 			int top = 1+(count-N);
			int bottom = S -(count - N);
			System.out.println(top+"/"+bottom);
		}else { // 짝수번쨰 줄수 좌하향
			int top = S -(count -N);
			int bottom = 1+(count-N);
			System.out.println(top+"/"+bottom);
		}
		br.close();	
		}

}
