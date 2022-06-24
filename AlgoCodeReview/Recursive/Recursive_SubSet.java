import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int n;
	static boolean[] ch;
	public void DFS(int L) {
		if(L > n) {
			String tmp = "";
			for(int i = 1 ; i<= n ; i++) {
				if(ch[i]) tmp += (i+" ");
			}
			if(tmp.length() > 0) {
				System.out.println(tmp);
			}
		}else {
			ch[L] = true;
			DFS(L+1);
			ch[L] = false;
			DFS(L+1);
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Main T = new Main();
		n = Integer.parseInt(br.readLine());
		ch = new boolean [n+1];
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
// 원래 답지는 int[] 배열을 사용했는데 나는 boolean을 사용했음.
// 크게 차이는 없지만 boolean 배열을 사용하는것이 int 배열보다 메모리 효율적으로 좀 더 좋음.  (int타입 보다 boolean 타입 더 작으니까..)
// 왠만하면 2가지로 나누어지는 배열은 boolean 타입을 쓰도록 하자..!!
