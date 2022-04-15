package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MakingStar_BOJ2447 {
static char[][] arr;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new char [N][N];
		
		for(int i = 0 ; i< arr.length;i++) { // 배열을 모두 초기화 ( 초기화 하지 않으면 null 이라
			Arrays.fill(arr[i], ' ');		// 배열이 찌그러져서나옴)
		}

		star(0,0,N); // 재귀함수 시작
		for(int i = 0 ; i< arr.length;i++) {
			System.out.println(arr[i]); // 배열 arr 찍기
		}
	}
	private static void star(int x, int y, int N) {
		// TODO Auto-generated method stub
		int key = N/3; // 3의 배수 형식이라 받는값을 N/3으로 줄여줄거임 (입력도 3의 제곱수만 들어옴)
		
		if(N == 1) { // 1이 들어오면 마지막이니까 * 을찍고 종료
			arr[x][y] = '*';
			return;
		}
		for(int i = 0 ; i  < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				if(i == 1 && j == 1) continue; // 배열의 1,1 은 항상 텅빔 (넘어감)
				star(x+(key*i),y+(key*j),key); // 시작점 이동 후 패턴 적용
			}
		}
	}
		
}
	


// 나중에 다시 한번 풀어야할듯 재귀 이해가 잘 안됨 ㅠ
