import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
//  (프로그래머스)
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(T.DFS(N));
	}
	public int DFS(int N) {
		if(N == 1) {
			return 1 ;
		}else {
			return N*DFS(N-1);
		}
	}
}

//
//자연수N이 입력되면 N!을 구하는 프로그램
//
//입력 ( 1 <= N <=100)
//
//첫째줄에 N! 입력.
//
//팩토리얼 구하기 기본중의 기본 이젠 외운듯
