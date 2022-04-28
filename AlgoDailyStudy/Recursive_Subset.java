package Recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subset {
static boolean[] visit;
static int N;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		visit  = new boolean[N+1]; // 방문처리 배열
		sub(1);
	}
	private static void sub(int x) {
		// TODO Auto-generated method stub
		if(x == N+1) { // 종료조건
			String ans ="";
			for(int  i = 1; i <= N ;i++) {
				if(visit[i]) { // 방문한 숫자만
					ans += (i+" "); // ans 에 입력
				}
			}
			if(ans.length() > 0) { // 공집합 출력 X
				System.out.println(ans);
			}
		}else {
			visit[x] = true; // 현재 x를 방문 처리
			sub(x+1);
			visit[x] = false; // 현재 x를 비방문 처리
			sub(x+1);
		}
	}

}
