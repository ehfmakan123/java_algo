import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int res = 0;
		if(a >= b) {
			res = a/b;
		}else {
			res = b/a;
		}
		System.out.println("곱 = " + a*b);
		System.out.println("몫 = " + res);
	
	}

}


// Q2. 두 개의 정수를 입력받아 곱과 몫을 출력.
