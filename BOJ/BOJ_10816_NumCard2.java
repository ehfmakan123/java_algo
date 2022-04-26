package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class NumCard2_BOJ10816 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < N ;i++) {
			int key = Integer.parseInt(st.nextToken());
			hm.put(key, hm.getOrDefault(key, 0) +1);
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int t = 0 ; t < M ;t++) {
			int key = Integer.parseInt(st.nextToken());
			sb.append(hm.getOrDefault(key,0)).append(" ");
		}
		System.out.println(sb.toString());
		br.close();
	}

}
