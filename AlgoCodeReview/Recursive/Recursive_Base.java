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
	public void DFS(int n) {
		if(n >0) {
			DFS(n-1);
			System.out.print(n+" ");
		}
	}
}

//
//자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력하는 프로그램을 작성
//
//입력 3<= N <=10
//
//첫째줄에 출력

// 진짜 기초적인 재귀함수 호출
// 문제라긴 애매하지만 그래도 일단 프로그래머스 방식으로 풀어보았음.
// DFS의 경우 Stack 형으로 쌓인 후 연산이 된다는 아이디어 및 break 조건 (종료 조건) 을 생각해주는게 기본 아이디어.
