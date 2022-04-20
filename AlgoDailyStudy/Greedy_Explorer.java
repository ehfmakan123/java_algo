package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Explorer {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res/Explorer_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N] ;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		Arrays.sort(arr);
		int res = 0 ; // 총 그룹의 수
		int cnt = 0 ;// 현재 그룹의 사람 수
		for(int i = 0 ; i< arr.length ; i++) {
			cnt++; // 인원 한명씩 추가
			if(cnt >= arr[i]) { // 현재 그룹의 인원수가 추가한 인원의 공포도 보다 높을 시
				res++; // 그룹 출발
				cnt = 0 ; // 현재 그룹 인원수 초기화
			}
		}
		System.out.println(res);
	}

}
