import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int key = Integer.MAX_VALUE;
		int [] arr =new int [10];
		while(true) {
			key = Integer.parseInt(st.nextToken());
			if(key == 0) {
				break;
			}else {
				arr[key/10]++;
			}
		}
		for(int i =0 ; i < 10 ; i++) {
			if(arr[i] != 0) {
				System.out.println(i+" : "+arr[i]+"개");
			}
		}
	}
}


// 십의 자릿수 빈도수 구하기.
// 100 미만 양의 정수 0이 들어올때 까지 입력.
// 입력받아가 0이 들어오면 종료. 마지막 0을 제외하고 그때까지 입력된 정수의
// 십의 자리 숫자가 몇개인지 작은수부터 출력.
