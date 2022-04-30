package DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Combination {
static int N , M , cnt;
static int[] res;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M =Integer.parseInt(st.nextToken());
		
		res = new int[M]; // 결과값 크기 M
		cnt = 0;
		comb(0 , 1); // 깊이 , 시작값.
		System.out.println("조합 갯수: " + cnt);

	}
	private static void comb(int D , int s) {
		// TODO Auto-generated method stub
		if(D == M) { // 깊이가 목표와 같으면
			for(int x : res) { // res출력
				System.out.print(x+" ");
			}
			System.out.println();
			cnt++;
		}else {
			for(int i = s; i <= N; i++) { // 시작값 s 부터 N 까지 조합  -> s 대신 1에서 시작하면 중복조합
				res[D] = i; // 현재 깊이 D에  i를 저장. (뽑은 수)
				comb(D+1 , i+1); // 다음 깊이로 갈때 
			}
		}
	}

}
