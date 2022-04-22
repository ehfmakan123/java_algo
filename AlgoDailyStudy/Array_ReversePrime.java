package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReversePrime {
static int Max = 100000;
static	boolean[] visit = new boolean [Max+1]; 
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 2 ; i <= Math.sqrt(Max) ;i++) {
			for(int j = 2 ; j* i <= Max ; j++) {
				if(!visit[i*j]) {
					visit[i*j] = true;
				}
			}
		}
		
		for(int i = 0 ; i< N ; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			int res = 0 ;
			while(tmp > 0) {
				int key = tmp%10;
				res = res * 10 + key;
				tmp /= 10;
			}
			if(!visit[res] && res >= 2) {
				System.out.print(res+" ");
			}
		}
		
	}


}
