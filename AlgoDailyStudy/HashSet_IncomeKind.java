package HashSet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class IncomeKind {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> ans = new ArrayList<>();
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		st = new StringTokenizer(br.readLine());
    
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 초기 window 설정 K-1칸짜리
		for(int i = 0 ; i < K - 1; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		
		int lt = 0 ;
    
		for(int rt = K-1; rt < N; rt++) {
			hm.put(arr[rt], hm.getOrDefault(arr[rt], 0)+1); // 오른쪽 끝 집어넣음.
			ans.add(hm.size()); // 집어넣은 사이즈 출력
			hm.put(arr[lt] , hm.get(arr[lt]) - 1); // 왼쪽끝 key 의 value값 1감소 
			if(hm.get(arr[lt]) == 0) { // 만약 value값이 0이면
				hm.remove(arr[lt]); // 해시맵에서 삭제
			}
			lt++; // 왼쪽끝의 좌표  +1
		}
    
		for(int x : ans) {
			System.out.print(x+" ");
		}

		
	}

}
