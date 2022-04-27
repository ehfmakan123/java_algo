package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class OverlapCheck {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<Integer, Integer> hm = new HashMap<>();
		int[] arr = new int[N];
		String ans = "U";
		for(int i = 0 ; i < N ;i++) {
			int key = Integer.parseInt(st.nextToken());
			hm.put(key, hm.getOrDefault(key, 0)+1);
			if(hm.get(key) > 1) {
				ans = "D";
				break;
			}
		}
		System.out.println(ans);
	}
}

//정렬 파트에 있는 문제인데 정렬로 풀면 Nlogn 해시맵으로 풀면 N 이여서 해시맵으로 풀었음
