package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//당신은 음식점의 계산을 도와주는 점원이다. 카운터에는 거스름돈 암튼 동전임 ㅇㅇ 무한임 , 거스름돈 N원일때 거슬러 줘야 하는 동전의 최소 개수

public class greedy {
	static int N , res;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		res = 0;
		int[] arr = {500,100,50,10};
		for(int i = 0 ; i < arr.length ; i++) {
			int cnt = 0 ;
			cnt =  N / arr[i];
			N %= arr[i] ;
			res += cnt;
			sb.append(arr[i] + "원은" + cnt + "개 입니다" + "\n");
		}
		sb.append("총 "+ res + "개 입니다.");
		System.out.println(sb.toString());
		br.close();
	}
}
