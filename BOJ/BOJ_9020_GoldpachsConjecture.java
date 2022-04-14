package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GoldpachsConjecture_BOJ9020 {
static int a ,b ;
static StringBuilder sb;
static boolean arr[] ;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		arr = new boolean [10001];
		arr[1] = true;
		
		for(int i  =2; i <= 100 ; i++) {
			if(!arr[i]) {
				for(int j = 2 ; j*i <=10000 ; j++) {
					arr[i*j] = true;
				}
			}
		}
		for(int t = 1 ; t <= T ; t++) {
			int N = Integer.parseInt(br.readLine());
			a = N/2;
			b = N/2;
			search(N);
		}
		sb.substring(0, sb.length()-1);
		System.out.println(sb.toString());
		br.close();
	}

	private static void search(int n) {
		// TODO Auto-generated method stub
		while(true) {
			if(!arr[a] && !arr[b]) {
				sb.append(a+" "+b+"\n");
				break;
			}else {
				a--;
				b++;
			}
		}
	}
}


// 소수를 구하는 파트 따로 두 수를 더하는 파트 따로 , 두 수의 차이가 적은방법을 반복문 하나로 구현해야 시관초과가 안난다.. ㅠ
