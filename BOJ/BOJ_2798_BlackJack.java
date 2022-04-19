package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack_BOJ2798 {
static int[] arr ;
static int res;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	//	System.setIn(new FileInputStream("res/BlackJack_input.txt"));
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		res = 0;
		arr = new int[N] ;
		for(int i = 0 ; i < N ; i ++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0 ; i < N ; i ++) {
			for(int j = i+1 ; j < N ; j++) {
				for(int k = j+1 ; k < N ;k++) {
					if(arr[i]+arr[j]+arr[k] <= M ) {
						res = Math.max(res, arr[i]+arr[j]+arr[k]);
					}
				}
			}
		}
		System.out.println(res);
	}

}

//..
