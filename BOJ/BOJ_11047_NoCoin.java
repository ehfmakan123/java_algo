package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NoCoin_BOJ11047 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res/NoCoin_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int cnt = 0 ;
		
		int arr[] = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = N-1; i >= 0 ; i--) { // 단위수가 큰 동전부터 확인
			if(arr[i] <= K) { // 목표값이 배열의 동전 보다 작으면
				cnt += (K/arr[i]); // 목표값 / 단위 만큼 카운팅 (동전 x개 소모)
				K =  K % arr[i]; // 남은 나머지를  K 값으로 바꿈
			}
		}
		System.out.println(cnt);
		br.close();
	}

}
