package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalcScore {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int [N+1];
		int sum = 0 ;
		
		
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
//		int cnt = 1;
//		for(int i = 1 ; i <= N ; i++) {
//			if(arr[i-1] == 1 && arr[i] == 1) {
//				sum+= cnt;
//				cnt++;
//			}else if(arr[i-1] == 1 && arr[i] == 0){
//				sum += cnt;
//				cnt = 1;
//			}
//		}
// ############################2번 방범 (더 쉬움 ) ##########################		
		int cnt = 0;
		for(int i = 0 ; i < N ; i++) {
			if(arr[i] == 1) {
				cnt++;
				sum += cnt;
			}else {
				cnt = 0 ;
			}
		}
		System.out.println(sum);
		
	}
}
