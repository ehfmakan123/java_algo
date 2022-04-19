package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hanoi_BOJ11729 {
static StringBuilder sb; // StringBuilder 로 모아서 안하면 시관초과 ...
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		sb.append(((int)Math.pow(2, N) -1)+"\n");
		hanoi(N,1,2,3); // N , 출발 , 중간 , 목적지
		System.out.println(sb.toString());
	}

	private static void hanoi(int n, int start, int mid,  int dest) {
		// TODO Auto-generated method stub
		if(n == 1) { // 이동할 원판이 하나면 그냥 이동 가능
			sb.append((start+" "+dest+"\n"));
			return;
		}
		// A -> C
		hanoi(n-1 , start , dest ,mid); // n-1개의 원판을 start 에서 mid 로 이동 (haoni (n-1))
		
		sb.append(start+" "+dest+"\n"); // 1개를 목적지로 이동(젤 큰 원판 1개) (n-1개 원판 이동 후 남은 원판 1개)
		
		hanoi(n-1,mid,start,dest); // 위에 나머지 n-1개를 mid 에서 dest 로 이동
	}


}

//하노이는 왜 계속해도 오랜만에 하면 또 생각이 안날까요 ㅠㅠ
