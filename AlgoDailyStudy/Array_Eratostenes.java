package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eratostenes {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean[] check = new  boolean [N+1];
		int cnt = 0 ;
		for(int i = 2 ; i <= N/2 ; i++) {
			for( int j = 2 ; j * i <= N ; j++) {
				if(!check[j*i]) {
					check[i*j] = true;
				}
			}
		}
		
		for(int i = 2 ; i < N ;i++) {
			if(!check[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
