package HashSet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class KthNum {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
    
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr =new int [N];
    
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); // 내림차순으로 정렬
		st = new StringTokenizer(br.readLine());
    
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int res = -1;
		
		for(int i = 0 ; i < N-2 ; i++) {
			for(int j = i+1; j < N-1 ;j++) {
				for(int k = j+1; k < N ;k++) {
					Tset.add(arr[i]+arr[j]+arr[k]);
				}
			}
		}
    
    
		int cnt = 0 ;
    
    
		for(int x : Tset) {
			cnt++;
			if(cnt == K) {
				res = x;
				break;
			}
		}
		System.out.println(res);
	}

}
