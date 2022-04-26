package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class FindNum_BOJ1920 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		TreeSet<Integer> ts = new TreeSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ;i++) {
			ts.add(Integer.parseInt(st.nextToken()));
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < M ;i++) {
			int key = Integer.parseInt(st.nextToken());
			if(ts.contains(key)) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
	}
}

// 정답률이 난이도에 비해 이상하게 낮으면 정렬하거나 계산하다 시간초과나거나 터지는 경우임 (Tree 이용한 이유)
