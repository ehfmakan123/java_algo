package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.StringTokenizer;

public class Subset_Test {
	static int N , total , S;
	static int[] input;
	static boolean[] isSelected;
	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("res/Subset_Test_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N =Integer.parseInt(st.nextToken());
		S =Integer.parseInt(st.nextToken());
		
		input  = new int [N];
		isSelected = new boolean[N];
		total = 0 ;
		st =new StringTokenizer(br.readLine()," ");
		for(int i = 0 ; i < N ; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		
		generateSubset(0);
		System.out.println("경우의 수 : " + total );
    br.close();
	}
	
	private static void generateSubset(int cnt) { // 부분집합을 만들기 위해 '고려된' 원소의 수.
		if(cnt == N ) { // 부분집합 완성.
			
			// 부분집합의 합을 구하자.
			int sum = 0;
			for(int i = 0 ; i <N ; i++) {
				if(isSelected[i]) sum += input[i];
			}
			if(sum == S) {
			total++;
			for(int i = 0 ; i <N ; i++) {
				if(isSelected[i]) System.out.print(input[i]+" ");
				}
				System.out.println();
			}
			return;
		}
		//현재 원소를 부분집합에 넣기
		isSelected[cnt] = true;
		generateSubset(cnt+1);
		// 넣지 않기
		isSelected[cnt] = false;
		generateSubset(cnt+1);
		
	}

}
