package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MovieMaker_BOJ1436 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 1;
		int num = 666;
		
		while(cnt != N) {
			num++;
			if(String.valueOf(num).contains("666")){ // 666이 포함되는 숫자일때
				cnt++;
			}
		}
		System.out.println(num);
	}

}

//브루트 포스로 풀면 쉬움 코드 효율 높이면 
