package Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Statistics_BOJ2108 {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res/Statistics_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int num = 8001 ; // -4000 ~ 4000 
		int[] arr = new int [num]; // 카운팅 정렬 도전..!
		int sum = 0;  // 합
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int mid = 9999; // 중간값
		int mode = 9999; // 최빈값
		
		
		for(int i = 0 ; i < N ; i++ ) { // 입력하면서 카운팅 정렬 준비
			int value = Integer.parseInt(br.readLine());
			arr[value+4000]++;
			sum += value;
			if(max < value) {
				max = value;
			}
			if(min > value) {
				min = value;
			}
		}
		
		int cnt = 0 ; // mid 값 나온 횟수 count
		int mode_max = 0 ; //  가장 큰 최빈값의 빈도수
		
		boolean flag = false; // 유일한 빈도수인지 확인
		
		for(int i = min + 4000 ; i <= max + 4000; i++) {
			if(arr[i] > 0) {
				if(cnt < (N+1)/2) { // cnt 가 N/2 지점에 있는 값 -> 중앙값
					cnt += arr[i]; // i의 빈도수를 cnt 에 누적
					mid = i - 4000;
				}
				
				if(mode_max < arr[i]) { // 이전 최대 최빈값 보다 현재 값의 빈도수가 높을 경우
					mode_max = arr[i]; 
					mode = i -4000;
					flag = true; // 현재 최대 빈도수임 (유일)
				}else if(mode_max == arr[i] && flag) { // 빈도수가 같고 최빈값이 "1번만 중복"
					mode = i -4000; // 두번째로 작은 수 저장 (이후에는 중복 되어도 최빈값 저장 X)
					flag = false;
				}
			}
		}
		System.out.println((int)Math.round((double)sum/N));
		System.out.println(mid);
		System.out.println(mode);
		System.out.println(max - min);
	}

}


// counting 정렬 사용하는데 아직 활용이 어려움
// 최빈값 조건이 까다로워서 https://st-lab.tistory.com/108 풀이 참조
// 안보고 풀정도로 연습해야지 ㅠㅠ
