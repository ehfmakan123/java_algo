import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int[] fib;
	public static void main(String[] args) throws Exception {
//  (프로그래머스)
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		fib = new int[N+1];
		T.DFS(N);
		for(int i = 1 ; i <= N ;i++) {
			System.out.print(fib[i]+" ");
		}
	}
	public int DFS(int N) {
		if(fib[N] > 0 ) return fib[N];
		if(N == 1 || N == 2) {
			return fib[N] = 1 ;
		}else {
			return fib[N] = DFS(N-2) + DFS(N-1); 
		}
	}
}

//
//피보나치 수열 입력. 
//
//입력 ( 3 <= N <=45)
//
//첫째줄에 피보나치 입력.
//
//
//피보나치 출력 , 메모이제이션을 적용해서 작성
