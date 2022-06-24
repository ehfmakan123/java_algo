import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int n;
	static int[] ch;
	public void DFS(int L) {
		if(L > n) {
			String tmp = "";
			for(int i = 1 ; i<= n ; i++) {
				if(ch[i] == 1) tmp += (i+" ");
			}
			if(tmp.length() > 0) {
				System.out.println(tmp);
			}
		}else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Main T = new Main();
		n = Integer.parseInt(br.readLine());
		ch = new int [n+1];
		T.DFS(1);
	}
}

// 숫자 N을 입력하면 1 ~ N 까지의 부분집합을 구하고 출력하시오
// 입력 : 3
// 출력 1 2 3
//      1 2
//      1
//      2 3
//      2
//      3

// 간단한 부분집합 구하기 문제 어려울건 없음. check 배열을 사용하자!
