package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NtoM3_BOj15651 {
static int M,N;
static int[] arr;
static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		per(0);
		System.out.println(sb.toString());
		br.close();
		
	}

	private static void per(int D) {
		// TODO Auto-generated method stub
		if(D == M) {
			for(int x : arr) {
				sb.append(x+" ");
			}
			sb.append("\n");
		}else {
			for(int i = 1 ; i <= N ; i++ ) {
				arr[D] = i;
				per(D+1);
			}
		}
		
	}

}
