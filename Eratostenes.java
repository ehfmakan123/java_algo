package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eratostenes {
static int cnt;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("에라토스 테네스의 체 시작");
		System.out.print("숫자 N을 입력하세요: ");
		int N = Integer.parseInt(br.readLine());
		cnt = 0;
		System.out.println("1~"+N+"까지의 소수를 나타냅니다....!");
		search(N);
		System.out.println("에라토스 테네스의 체 끝...!");
	}

	private static void search(int n) {
		// TODO Auto-generated method stub
		boolean[] arr = new boolean [n+1]; // 소수인지 아닌지 배열에 넣고 T/F
		arr[1] = true; // 1은 예외 처리 (필요시 0도 예외처리)
		for(int i = 2 ; i <= n ; i++) { // 2 ~ N 까지 탐색
			if(!arr[i]) { // false 인 경우 -> 탐색전 혹은 다른 소수의 배수가 아닌것
				for(int j = 2; j*i <= n ; j++) {
					arr[i*j] = true; //  진행 하던 수 i 의 배수인 경우를 전부 true 처리 (소수 X)
				}
			}
		}
		for(int i = 2; i <= n ; i++) { // 체가 끝난 후 전수검사
			if(!arr[i]) { // false 상태 (소수) 인것만 카운트 or 출력
				cnt++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("전체 소수는 "+ cnt+"개입니다!!");
	}

}


// 에라토스테네스의 체 
