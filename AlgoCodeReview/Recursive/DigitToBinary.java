import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
//  (프로그래머스)
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		T.DFS(N);
	}
	public void DFS(int N) {
		if(N == 0) return;
		else {
			DFS(N/2);
			System.out.print(N%2+" ");
		}
	}
}

//
//10진수 N이 입력되면 재귀함수를 이용하여 2진수로 출력하는 프로그램을 작성
//
//입력 ( 1 <= N <=1000 )
//
//첫째줄에 이진수 출력
//
// 10진수 2진수로 바꾸는 방법 (2로 계속 나눈 후 나머지 적기) 만 기억하면됨

