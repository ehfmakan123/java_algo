package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LIS {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setIn(new  FileInputStream("res/LIS_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N]; // 입력 값 저장 배열
		int[] cnt = new int[N]; // 카운팅 저장 배열
		
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0 ; i < N ; i++) {
				cnt[i] = 1; // 자기자신부터 시작 -> 길이 1
			for(int j = 0 ; j < i ; j++) {
				if(arr[j] < arr[i] && cnt[i] < cnt[j] +1) { 
					cnt[i] = cnt[j] + 1;
				}
			}
		}
		Arrays.sort(cnt);
		System.out.println(cnt[N-1]);
		br.close();
	}

}
