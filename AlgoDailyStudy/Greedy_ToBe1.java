package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int cnt = 0 ;
		while(N != 1) {
			if(N % K != 0 ) {
				N--;
				cnt++;
			}else {
				N /= K;
				cnt++;
			}
		}
		System.out.println(cnt);
	}	

}

// 입력된 N 이 1이 될때까지 (k로 나누어 떨어질 때) K로 나누거나 -1 해서 몇단계를 거치는가 계산하기
