package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FindPrime2_BOJ2581 {
	static int sum , min;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res/FindPrime2_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sum = 0;
		min = Integer.MAX_VALUE;
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		for(int i = M ; i < N+1 ; i++) {
			if(i == 1) {
				continue;
			}
			find(i);
		}
		if(sum == 0) {
			System.out.println("-1");
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
	private static void find(int i) {
		boolean key = false ;
		for(int x = 2 ; x < (i/2)+1 ; x++) {
			if(i%x == 0 ) {
				key = true;
				break;
			}
		}
		if(!key) {
			sum += i;
			min = Math.min(min , i);
		}
	}

}

//소수 없을때 예외처리 안한거 깜빡해서 코드 뒤집을뻔;
